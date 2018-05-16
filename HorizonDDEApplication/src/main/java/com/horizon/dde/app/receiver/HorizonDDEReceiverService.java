package com.horizon.dde.app.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.model.HorizonDDEModel;

@Component
public class HorizonDDEReceiverService {

	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(HorizonDDEModel logs) {
        System.out.println("Recieved Message: " + logs);
    }
}
