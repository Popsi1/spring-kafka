package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "topic", groupId = "groupId")
    void listener(List<String> data){
        System.out.println("listener received: " + data);
    }
}
