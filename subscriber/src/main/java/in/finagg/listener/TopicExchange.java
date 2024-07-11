package in.finagg.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import in.finagg.configuration.ListenerConstant;

@Service
public class TopicExchange {
	
	//@RabbitListener(queues = ListenerConstant.TOP, containerFactory = "rbFactory", id=ListenerConstant.TOP)
	public void receiveMessageForDashboard(final Message message) throws  Exception {
	 
			 
		throw new RuntimeException("test");
	}

}
