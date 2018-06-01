package com.horizon.dde.app.sender;


import java.util.ArrayList;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.AbstractDDEModel;
import com.horizon.dde.app.model.HorizonDDEPersonModel;

@Component
public class HorizonDDESenderService {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	public void produce(ArrayList<AbstractDDEModel> arrayList){
		String routingKey = "sys.dev.info";
			amqpTemplate.convertAndSend(exchange, routingKey, arrayList);
	}
}