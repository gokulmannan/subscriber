package in.finagg.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.finagg.configuration.ListenerConstant;
@Service
public class LetterQueue {
 		
    @Autowired
    private RabbitTemplate rabbitTemplate;

    
		@RabbitListener(queues = ListenerConstant.DEAD, containerFactory = "rbFactory", id=ListenerConstant.DEAD)
		public void receiveMessageForDashboard(final Message message) throws  Exception {
			try {
				 
				System.out.println("received"+ message);
				System.out.println("received"+ message);
		         // Prepare reply message
	            MessageProperties replyProperties = new MessageProperties();
	            replyProperties.setCorrelationId(message.getMessageProperties().getCorrelationId());
	            replyProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);

	            // Example reply content (you need to construct this based on your application logic)
	            String replyContent = "{\"status\": \"success\"}";

	            // Build the reply message
	            Message replyMessage = MessageBuilder.withBody(replyContent.getBytes())
	                    .andProperties(replyProperties)
	                    .build();

	            // Send the reply message
	            rabbitTemplate.send(message.getMessageProperties().getReplyTo(), replyMessage);
 				
			} catch (Exception e) {
				e.printStackTrace();
				 
			}
		}

	

}
