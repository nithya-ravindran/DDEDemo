package com.csscorp.taskgenerator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"simple-messaging","hello-world"})
@Configuration
public class TaskGeneratorConfig {


	@Bean
	public Queue queue() {
		return new Queue("simple-queue");
	}
	
	@Profile("sender")
	@Bean
	public Sender sender() {
		return new Sender();
	}
	
	@Bean
	public FileDumpLoader fileDumpLoader() throws FileNotFoundException {
			return new FileDumpLoader();
	}
	
	@Profile("receiver") 
	private static class ReceiverConfig {
		
		@Bean
		public Worker receiverOne() {
			return new Worker(1);
		}
		
		
		@Bean
		public Worker receiverTwo() {
			return new Worker(2);
		}
		

		@Bean
		public Worker receiverThree() {
			return new Worker(3);
		}
		
	}
	
    @Bean
    public MessageConverter jsonMessageConverter()
    {
        Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
        jsonMessageConverter.setClassMapper(classMapper());
        return jsonMessageConverter;
    }


    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory)
    {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(jsonMessageConverter());
        return template;
    }

    @Bean
    public DefaultClassMapper classMapper()
    {
        DefaultClassMapper classMapper = new DefaultClassMapper();
        Map<String, Class<?>> idClassMapping = new HashMap<>();
        idClassMapping.put("java.util.ArrayList", ArrayList.class);
        classMapper.setIdClassMapping(idClassMapping);
        return classMapper;
    }

}
