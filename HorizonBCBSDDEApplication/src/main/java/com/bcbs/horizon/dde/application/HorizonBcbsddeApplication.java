package com.bcbs.horizon.dde.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan(basePackages = "com.bcbs.horizon.dde")
public class HorizonBcbsddeApplication {
	
	
	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println("This app uses Spring profiles to control its behaviour.");
				System.out.println("Sample usage : java -jar readerapp.jar --spring.profiles.active=hello_world,sender");
			}
			
		};
	}
	
	@Profile("!usage_message")
	@Bean
	public CommandLineRunner usageTwo() {
		System.out.println("Inside usage two..");
		return new AppRunner();
	}

	public static void main(String[] args) {
		System.out.println("Main method starts....");
		SpringApplication.run(HorizonBcbsddeApplication.class, args);
	}
}
