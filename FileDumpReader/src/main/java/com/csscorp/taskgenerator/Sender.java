package com.csscorp.taskgenerator;

import java.util.ArrayList;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Queue queue;
	
	@Autowired
	private FileDumpLoader fileLoader;
	
	public void send() {
		
		try {
			for(int i = 0; i < fileLoader.getTable().size(); i++) {
				System.out.println(" [Sender] Received message size is  '" +fileLoader.getTable().get(i) +"' " );
				 
			}
			
			
			rabbitTemplate.convertAndSend(queue.getName(),fileLoader.getTable()); 
			fileLoader.setTable( new ArrayList<>());	
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
}
