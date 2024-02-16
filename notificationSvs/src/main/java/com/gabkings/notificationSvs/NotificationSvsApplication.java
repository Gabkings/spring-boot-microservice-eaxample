package com.gabkings.notificationSvs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
@EnableKafka
@Configuration
public class NotificationSvsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationSvsApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic")
	public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
		// send out an email notification
		log.info("Received Notification for Order - {}", orderPlacedEvent.getOrderNumber());
	}

}
