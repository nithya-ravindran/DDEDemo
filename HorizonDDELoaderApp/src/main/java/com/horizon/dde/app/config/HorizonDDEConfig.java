package com.horizon.dde.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.horizon.dde.app.dao.PersonDao;



@Configuration
public class HorizonDDEConfig  {
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;
    @Value("${spring.data.elasticsearch.cluster-name}")
    private String clusterName;
    private RestHighLevelClient restHighLevelClient;
    //private RestClient restClient ;
    
   
    @Bean
	public PersonDao personDao() {
		PersonDao pdao = null ;
		try {
			pdao = new PersonDao( buildClient());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pdao;
	}

	
	@Bean
    public RestHighLevelClient buildClient() {
    	RestClientBuilder restClientBuilder = RestClient.builder(new HttpHost("localhost", 9200, "http")); //,new HttpHost("localhost", 9301, "http")
    //	restClient = restClientBuilder.build();
        try {
            restHighLevelClient = new RestHighLevelClient(restClientBuilder);
            
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return restHighLevelClient;
    }
	
	@Bean
    public MessageConverter jsonMessageConverter(){
		Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
        jsonMessageConverter.setClassMapper(classMapper());
        return jsonMessageConverter;
    }
    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }
    @Bean
    public SimpleRabbitListenerContainerFactory jsaFactory(ConnectionFactory connectionFactory,
        SimpleRabbitListenerContainerFactoryConfigurer configurer) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        configurer.configure(factory, connectionFactory);
        factory.setMessageConverter(jsonMessageConverter());
        return factory;
    }
    
    @Bean
    public DefaultClassMapper classMapper() {
        DefaultClassMapper classMapper = new DefaultClassMapper();
        Map<String, Class<?>> idClassMapping = new HashMap<>();
        idClassMapping.put("java.util.ArrayList<com.horizon.dde.app.model.AbstractDDEModel>", ArrayList.class);
        classMapper.setIdClassMapping(idClassMapping);
        return classMapper;
    }
}
