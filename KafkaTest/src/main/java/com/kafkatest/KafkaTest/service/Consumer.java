package com.kafkatest.KafkaTest.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics="javatechie-demo2",groupId = "codeDecodeGroup")
    public void receiveKafkaMsg(String receivedMesg){
        System.out.println("your messgae is "+receivedMesg);
    }
}
