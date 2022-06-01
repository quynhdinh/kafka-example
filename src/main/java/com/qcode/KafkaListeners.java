package com.qcode;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "qcode",
    groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received data: " + data + " !");
    }
}
