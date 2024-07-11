package in.finagg.listener;
import com.rabbitmq.client.Channel;

import org.springframework.amqp.core.*;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.finagg.bean.ApiResponse;
import in.finagg.bean.NotificationRequest;
import in.finagg.bean.NotificationResponse;
import in.finagg.client.NotificationClientSubscriber;
import in.finagg.configuration.ListenerConstant;


@Service
public class HdfcNotificationService {

    @Autowired
    private NotificationClientSubscriber notificationClientSubscriber;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper mapper;

   // @RabbitListener(queues = "GST_OD", containerFactory = "rbFactory")
    public void receiveMessageForDashboard(final Message message, Channel channel) throws Exception {
        try {
            // Parse the incoming message
            NotificationRequest request = mapper.readValue(message.getBody(), NotificationRequest.class);

            // Process the request and create the response
            ApiResponse<NotificationResponse> response = notificationClientSubscriber.sendNotification(request);

            // Create the response message
            MessageProperties replyProperties = new MessageProperties();
            replyProperties.setCorrelationId(message.getMessageProperties().getCorrelationId());
            replyProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
            Message responseMessage = MessageBuilder.withBody(mapper.writeValueAsString(response).getBytes())
                    .andProperties(replyProperties)
                    .build();

            // Send the response message
            rabbitTemplate.send(message.getMessageProperties().getReplyTo(), responseMessage);
        } catch (Exception e) {
            e.printStackTrace();

            // Handle the error and send an error response if necessary
        }
    }
}