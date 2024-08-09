package com.example.kafka.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerClass {

	@Value("${topics}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemaplate;

	public void sendMessage(String msg) {
		kafkaTemaplate.send(topic, msg);

	}

}
