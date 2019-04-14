package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
	@KafkaListener(topics = KafkaTest.TOPIC_NAME, groupId = "${spring.kafka.consumer.group-id}")
	public void listen(@Payload TestObj obj) {
		System.out.println("Received: " + obj);
	}
}
