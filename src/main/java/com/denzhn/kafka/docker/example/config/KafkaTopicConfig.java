package com.denzhn.kafka.docker.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic createDemoTopic(){
        return new NewTopic("denzhn-topic", 1, (short) 1);
    }
}
