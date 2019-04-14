package com.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableKafka
@Configuration
@SpringBootApplication
public class KafkaTest {
	public static final String TOPIC_NAME = "spring.test.topic";

	public static void main(String[] args) {
		SpringApplication.run(KafkaTest.class, args);
	}

	@Bean
	public NewTopic topic() {
		return new NewTopic(TOPIC_NAME, 1, (short) 1);
	}
}
