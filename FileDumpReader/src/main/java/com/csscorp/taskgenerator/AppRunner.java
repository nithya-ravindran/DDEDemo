package com.csscorp.taskgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

public class AppRunner implements CommandLineRunner {
	
	@Value("${tutorial.client.duration:0}")
    private int duration;
	
	@Autowired
	private ConfigurableApplicationContext context;
	
	@Autowired
	private FileDumpLoader fileLoader;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ready ... running for " + duration + "ms");
		fileLoader.readFile(2);
			
			//context.close();
	}

}
