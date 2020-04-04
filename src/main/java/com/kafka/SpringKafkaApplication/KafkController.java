package com.kafka.SpringKafkaApplication;


import com.kafka.SpringKafkaApplication.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkController {
    @Autowired
    private Producer producer;

    @GetMapping("/publish")
    private void sendMessage(@RequestParam("message") String mesage) {
        producer.sendMessage(mesage);
    }
}
