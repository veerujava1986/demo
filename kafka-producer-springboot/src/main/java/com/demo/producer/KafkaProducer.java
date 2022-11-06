package com.demo.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    public void sendMessage(){

        kafkaTemplate.send("topic1","hello veeru");
    }

}
