package com.bcbs.horizon.dde.sender;

import java.util.ArrayList;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcbs.horizon.dde.helper.HorizonBcbsDDEFeedReadSenderHelper;
import com.bcbs.horizon.dde.model.AbstractDDEModel;

@Component
public class HorizonBcbsDDESenderService {
	
	public HorizonBcbsDDESenderService() {
		System.out.println("horizonBcbsDDESenderService is initialized");
	}

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;
	
	
	public void send(ArrayList<AbstractDDEModel> table) {
		
		try {
			for(int i = 0; i < table.size(); i++) {
				System.out.println(" [Sender] Received message size is  '" +table.get(i) +"' " );
				 
			}
			
			rabbitTemplate.convertAndSend(queue.getName(),table); 
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
}
