package com.kafka;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.kafka.KafkaTest.TOPIC_NAME;

@Component
public class TestProducer {
	private final KafkaTemplate<String, TestObj> kafka;
	private Random random = new Random();
	private long id = 1;

	@Autowired
	public TestProducer(KafkaTemplate<String, TestObj> kafka) {
		this.kafka = kafka;
	}

	@Scheduled(fixedRate = 1000)
	public void run() throws Exception {
		TestObj testObj = new TestObj(id++, random.nextLong(), random.nextLong(), random.nextLong());

		System.out.println("Sending: " + testObj.toString());

		kafka.send(new ProducerRecord<>(TOPIC_NAME, "-", testObj));
	}
}
