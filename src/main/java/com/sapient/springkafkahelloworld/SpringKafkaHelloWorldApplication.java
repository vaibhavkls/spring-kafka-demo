package com.sapient.springkafkahelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * After running the Spring boot application,
 * start consumer service
 * D:\kafka_2.12-2.3.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic users --from-beginning
 */
@SpringBootApplication(scanBasePackages = "com.sapient.kafka")
public class SpringKafkaHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaHelloWorldApplication.class, args);
	}

}
