package com.kafkatest.KafkaTest.controller;

import com.kafkatest.KafkaTest.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/producer-app")
public class EventPublisher {

        @Autowired
        private KafkaMessagePublisher publisher;

        @GetMapping("/publish/{message}")
        public ResponseEntity<?> publishMessage(@PathVariable String message) {
             publisher.sendMessageToTopic(message + " : ");
             return ResponseEntity.ok("message published successfully ..");
        }

}
