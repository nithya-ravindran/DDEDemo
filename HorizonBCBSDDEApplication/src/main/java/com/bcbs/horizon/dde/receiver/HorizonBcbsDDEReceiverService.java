package com.bcbs.horizon.dde.receiver;

import java.util.ArrayList;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.bcbs.horizon.dde.model.HorizonBcbsDDEDemoModel;

@RabbitListener(queues = "simple-queue")
public class HorizonBcbsDDEReceiverService {
	
	private int instanceID;
	
	public HorizonBcbsDDEReceiverService(int id) {
		this.instanceID = id;
	}
	
	@RabbitHandler
	public void receive(ArrayList<HorizonBcbsDDEDemoModel> messageList) {
		System.out.println(" [Worker-"+this.instanceID+"] Received message is  '" + messageList.toString() +"' " );
	}
}
