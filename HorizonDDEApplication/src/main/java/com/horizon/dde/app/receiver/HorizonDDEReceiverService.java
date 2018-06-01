package com.horizon.dde.app.receiver;

import java.util.ArrayList;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.AbstractDDEModel;
import com.horizon.dde.app.model.HorizonDDEDemoModel;

@Component
public class HorizonDDEReceiverService {
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(ArrayList<AbstractDDEModel> arrayList) {
		for(Object row : arrayList) {
			System.out.println("Message  Recieved : " +  (AbstractDDEModel) row);
		}
		//return arrayList;
    }
}
