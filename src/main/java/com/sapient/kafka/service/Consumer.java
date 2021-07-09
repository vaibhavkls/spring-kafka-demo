package com.sapient.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/*
 * The consumer which consumes the message from the 
 * topic users and output the logs to the console.
 */
@Service
public class Consumer {
	private final Logger logger = 
			LoggerFactory.getLogger(Consumer.class);
	@KafkaListener(topics = "users", groupId = "group_id")
	public void consume(String message){
		logger.info(String.format("$$ -> Consumed Message ->"
				+ " %s",message));
	}
}