package com.sapient.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.kafka.service.Producer;

@RestController
public class ApacheKafkaWebController {

	@Autowired
	Producer producer;
	
	//http://localhost:9000/producer?message=test 
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		producer.sendMessage(message);
		return "Test message sent to the Kafka Topic 'users' Successfully";
	}
	
	//http://localhost:9000/producer1/test
	@GetMapping(value = "/producer1/{message}")
	public String producer1(@PathVariable("message") String message) {
			producer.sendMessage(message);
			return "Sample message sent to the Kafka "
					+ "Topic 'users' Successfully";
		}

}