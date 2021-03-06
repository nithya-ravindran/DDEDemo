package com.javasampleapproach.rabbitmq.sender;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.javasampleapproach.rabbitmq.model.Log;

@Component
public class Producer {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	public void produce(Log logs){
		String routingKey = logs.getRoutingKey();
		amqpTemplate.convertAndSend(exchange, routingKey, logs);
		System.out.println("Send msg = " + logs);
	}
}