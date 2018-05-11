package com.csscorp.taskgenerator;

import java.util.ArrayList;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "simple-queue")
public class Worker {
	
	private int instanceID;
	
	public Worker(int id) {
		this.instanceID = id;
	}
	
	@RabbitHandler
	public void receive(ArrayList<DataRow> messageList) {
		System.out.println(" [Worker-"+this.instanceID+"] Received message is  '" + messageList.toString() +"' " );
	}
}
