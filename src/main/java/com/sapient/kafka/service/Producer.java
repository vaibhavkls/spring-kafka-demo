package com.sapient.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
/*
 * The producer which uses Spring's KafkaTemplate 
 * to send the message to a topic named users, 
 */
@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private static final Logger logger = 
			LoggerFactory.getLogger(Producer.class);
	
	private static final String TOPIC = "users2s";

	public void sendMessage(String message){
		logger.error(String.format("$$ -> Producing message --> %s",message));
		kafkaTemplate.send(TOPIC,message);
		}
}