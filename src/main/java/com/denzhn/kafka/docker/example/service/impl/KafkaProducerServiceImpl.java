package com.denzhn.kafka.docker.example.service.impl;

import com.denzhn.kafka.docker.example.service.KafkaProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {
    private static final String DEMO_TOPIC= "denzhn-topic";
    private final KafkaTemplate<String, String> template;

    public KafkaProducerServiceImpl(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    @Override
    @Scheduled(fixedRate = 3000)
    public void send() {
        template.send(DEMO_TOPIC, "Wow we are running kafka with docker!");
    }
}
