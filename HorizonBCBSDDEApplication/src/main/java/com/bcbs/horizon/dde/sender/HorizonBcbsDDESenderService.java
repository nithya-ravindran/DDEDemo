package com.bcbs.horizon.dde.sender;

import java.util.ArrayList;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bcbs.horizon.dde.model.AbstractDDEModel;

@Component
public class HorizonBcbsDDESenderService {
	
	public HorizonBcbsDDESenderService() {
		System.out.println("horizonBcbsDDESenderService is initialized");
	}

	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	
	public void send(ArrayList<AbstractDDEModel> table) {
		
		try {
			for(int i = 0; i < table.size(); i++) {
				System.out.println(" [Sender] Received message size is  '" +table.get(i) +"' " );
				 
			}
			
			amqpTemplate.convertAndSend(exchange, "sys.#",table); 
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	/*public void produce(Log logs){
		String routingKey = logs.getRoutingKey();
		amqpTemplate.convertAndSend(exchange, routingKey, logs);
		System.out.println("Send msg = " + logs);
	}*/
	
}
