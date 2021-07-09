package com.sapient.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.sapient.kafka.service.Producer;


//A simple REST controller that exposes one endpoint, /publish
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	@Autowired
	private Producer producer;
	
	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(
			@RequestParam("message") String message){
		this.producer.sendMessage(message);
	}
	
	
	
	
}