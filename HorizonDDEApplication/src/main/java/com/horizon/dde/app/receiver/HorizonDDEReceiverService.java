package com.horizon.dde.app.receiver;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.horizon.dde.app.dao.PersonDao;

@Component
public class HorizonDDEReceiverService {
	
	@Autowired
	private PersonDao dataDao;
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(ArrayList<LinkedHashMap> arrayList) {
		for(LinkedHashMap row : arrayList) {
			System.out.println("Message  Recieved : " +   row);
			dataDao.insertPerson(row);
			
		}
    }
}
