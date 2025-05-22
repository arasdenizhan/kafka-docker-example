package com.denzhn.kafka.docker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KafkaDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDockerExampleApplication.class, args);
	}

}
