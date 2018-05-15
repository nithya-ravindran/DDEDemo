package com.bcbs.horizon.dde.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bcbs.horizon.dde.config.HorizonBcbsDDEConfig;
import com.bcbs.horizon.dde.helper.HorizonBcbsDDEFeedReadSenderHelper;


public class AppRunner implements CommandLineRunner {
	
	@Value("${tutorial.client.duration:0}")
    private int duration;
	
	private AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(HorizonBcbsDDEConfig.class);
	
	@Autowired
	HorizonBcbsDDEFeedReadSenderHelper fileLoader;

	
	@Override
	public void run(String... args) {
		System.out.println("Ready ... running for " + duration + "ms");
		System.out.println("registered beans count : " +context.getBeanDefinitionCount() );
		for(String beanName : context.getBeanDefinitionNames()) {
			System.out.println("registered beans : \n" +beanName );
		}
		
		//fileLoader = context.getBean("horizonBcbsDDEFeedReadSenderHelper",HorizonBcbsDDEFeedReadSenderHelper.class);
		fileLoader.readFile(2);
		
		//context.close();
	}

}
