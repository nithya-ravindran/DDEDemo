package com.bcbs.horizon.dde.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bcbs.horizon.dde.helper.HorizonBcbsDDEFeedReadSenderHelper;
import com.bcbs.horizon.dde.sender.HorizonBcbsDDESenderService;

@PropertySource("classpath:application.properties")
@Configuration
public class HorizonBcbsDDEConfig {

	@Bean
	public HorizonBcbsDDESenderService horizonBcbsDDESenderService() {
		System.out.println("horizonBcbsDDESenderService is initialized");
		return new HorizonBcbsDDESenderService();
	}

	@Bean
	public HorizonBcbsDDEFeedReadSenderHelper horizonBcbsDDEFeedReadSenderHelper() {
		System.out.println("HorizonBcbsDDEConfig : File load is initialized");
		return new HorizonBcbsDDEFeedReadSenderHelper();
	}
	

	@Bean
	public ConnectionFactory rabbitMqConnectionFactory() {
		return new CachingConnectionFactory();
	}
	
	@Bean
	public MessageConverter jsonMessageConverter() {
		Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
		jsonMessageConverter.setClassMapper(classMapper());
		return jsonMessageConverter;
	}

	@Bean
	public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jsonMessageConverter());
		return rabbitTemplate;
	}

	@Bean
	public DefaultClassMapper classMapper() {
		DefaultClassMapper classMapper = new DefaultClassMapper();
		Map<String, Class<?>> idClassMapping = new HashMap<>();
		idClassMapping.put("java.util.ArrayList", ArrayList.class);
		classMapper.setIdClassMapping(idClassMapping);
		return classMapper;
	}
	
	@Bean
	@Autowired
	public SimpleRabbitListenerContainerFactory jsaFactory(ConnectionFactory connectionFactory,
			SimpleRabbitListenerContainerFactoryConfigurer configurer) {
		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
		factory.setMaxConcurrentConsumers(3);
		configurer.configure(factory, connectionFactory);
		factory.setMessageConverter(jsonMessageConverter());
		return factory;
	}

}
