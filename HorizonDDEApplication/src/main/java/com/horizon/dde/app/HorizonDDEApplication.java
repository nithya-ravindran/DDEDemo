package com.horizon.dde.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.horizon.dde.app.model.HorizonDDEModel;
import com.horizon.dde.app.sender.HorizonDDESenderService;

@SpringBootApplication
public class HorizonDDEApplication  implements CommandLineRunner{
 
	public static void main(String[] args) {
		SpringApplication.run(HorizonDDEApplication.class, args);
	}
	
	@Autowired
	HorizonDDESenderService producer;
 
	@Override
	public void run(String... args) throws Exception {
		
		/**
		 *  1
		 */
		String content = "2014-03-05 10:58:51.1  INFO 45469 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/7.0.52";
		String routingKey = "sys.dev.info";
		
		// send to RabbitMQ
		producer.produce(new HorizonDDEModel(content, routingKey));
		
		/**
		 *  2
		 */
		content = "2017-10-10 10:57:51.10 ERROR in ch.qos.logback.core.joran.spi.Interpreter@4:71 - no applicable action for [springProperty], current ElementPath is [[configuration][springProperty]]";
		routingKey = "sys.test.error";
		
		// send to RabbitMQ
		producer.produce(new HorizonDDEModel(content, routingKey));
		
		/**
		 *  3
		 */
		content = "2017-10-10 10:57:51.112  ERROR java.lang.Exception: java.lang.Exception";
		routingKey = "app.prod.error";
		
		// send to RabbitMQ
		producer.produce(new HorizonDDEModel(content, routingKey));
	}
}
