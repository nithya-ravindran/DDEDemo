package com.horizon.dde.app.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.HorizonDDEDemoModel;

@Component
public class HorizonDDEReceiverService {
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(HorizonDDEDemoModel dataRow) {
        System.out.println("Message  Recieved : " + dataRow);
    }
}
