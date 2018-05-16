package com.bcbs.horizon.dde.receiver;

import java.util.ArrayList;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.bcbs.horizon.dde.model.HorizonBcbsDDEDemoModel;


@Component
public class HorizonBcbsDDEReceiverService {
	
	private int instanceID;
	
	public HorizonBcbsDDEReceiverService(int id) {
		this.instanceID = id;
	}
	
	public HorizonBcbsDDEReceiverService() {
		
	}
	
/*	@RabbitHandler
	public void receive(ArrayList<HorizonBcbsDDEDemoModel> messageList) {
		System.out.println(" [Worker-"+this.instanceID+"] Received message is  '" + messageList.toString() +"' " );
	}*/
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(ArrayList<HorizonBcbsDDEDemoModel> messageList) {
        System.out.println("[Worker-"+this.instanceID+"] Recieved Message: " + messageList.toString());
    }
}
