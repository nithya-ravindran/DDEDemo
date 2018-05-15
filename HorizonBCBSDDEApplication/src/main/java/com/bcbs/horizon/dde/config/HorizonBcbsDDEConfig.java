package com.bcbs.horizon.dde.config;

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
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

import com.bcbs.horizon.dde.helper.HorizonBcbsDDEFeedReadSenderHelper;
import com.bcbs.horizon.dde.receiver.HorizonBcbsDDEReceiverService;
import com.bcbs.horizon.dde.sender.HorizonBcbsDDESenderService;

@Profile({"simple-messaging","hello-world"})
@PropertySource("classpath:application.properties")
@Configuration
public class HorizonBcbsDDEConfig {
	


	@Bean
	public Queue queue() {
		 System.out.println("queue is initialized");
		return new Queue("simple-queue");
	}
	@Order(1)
	@Profile("sender")
	@Bean
	public HorizonBcbsDDESenderService horizonBcbsDDESenderService() {
		 System.out.println("horizonBcbsDDESenderService is initialized");
		return new HorizonBcbsDDESenderService();
	}
	
	@Order(2)
	@Bean
	public HorizonBcbsDDEFeedReadSenderHelper horizonBcbsDDEFeedReadSenderHelper(){
		 System.out.println("HorizonBcbsDDEConfig : File load is initialized");
			return new HorizonBcbsDDEFeedReadSenderHelper();
	}
	
	@Profile("receiver") 
	private static class ReceiverConfig {
		
		@Bean
		public HorizonBcbsDDEReceiverService horizonBcbsDDEReceiverServiceOne() {
			 System.out.println("horizonBcbsDDEReceiverServiceOne is initialized");
			return new HorizonBcbsDDEReceiverService(1);
		}
		
		@Bean
		public HorizonBcbsDDEReceiverService horizonBcbsDDEReceiverServiceTwo() {
			 System.out.println("horizonBcbsDDEReceiverServiceTwo is initialized");
			return new HorizonBcbsDDEReceiverService(2);
		}

		@Bean
		public HorizonBcbsDDEReceiverService horizonBcbsDDEReceiverServiceThree() {
			 System.out.println("horizonBcbsDDEReceiverServiceThree is initialized");
			return new HorizonBcbsDDEReceiverService(3);
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
