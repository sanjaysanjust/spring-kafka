package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerClass {

	/**@Value("${spring.kafka.template.default-topic}")
	private String topic;

	@Value("${groupId}")
	private String groupId;**/

	@KafkaListener(topics = "tutorialspoint", groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
		System.out.println(message.getClass().getName());
	}

}
