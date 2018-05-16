package com.horizon.dde.app.sender;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.HorizonDDEModel;

@Component
public class HorizonDDESenderService {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	public void produce(HorizonDDEModel logs){
		String routingKey = logs.getRoutingKey();
		amqpTemplate.convertAndSend(exchange, routingKey, logs);
		System.out.println("Send msg = " + logs);
	}
}