package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.kafka.Producer.ProducerClass;

@SpringBootApplication
public class SpringKafkaApplication implements ApplicationRunner{
	@Autowired
	private ProducerClass producer;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		producer.sendMessage("Hello Heman How are you");
		
	}

}
