package com.horizon.dde.app.sender;


import java.util.ArrayList;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.AbstractDDEDemoModel;
import com.horizon.dde.app.model.HorizonDDEPersonModel;

@Component
public class HorizonDDESenderService {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${rabbitmq.exchange}")
	private String exchange;
	
	@Value("${rabbitmq.routingkey}")
	private String routingKey;
	
	public void produce(ArrayList<AbstractDDEDemoModel> arrayList){
		
			amqpTemplate.convertAndSend(exchange, routingKey, arrayList);
	}
}