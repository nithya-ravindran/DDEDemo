package com.csscorp.taskgenerator;

/* Type 1 solution 
 * URL : https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp.html
 * */


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@EnableScheduling
//@EnableAsync
public class FileDumpReaderApplication {
	
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
		
		return new AppRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(FileDumpReaderApplication.class, args);
	}
}
