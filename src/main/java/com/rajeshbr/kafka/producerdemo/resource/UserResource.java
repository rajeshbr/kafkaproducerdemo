package com.rajeshbr.kafka.producerdemo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rajeshbr.kafka.producerdemo.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {

    private final String TOPIC = "demo-user-topic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC, new User(name, new java.math.BigDecimal(100000L)));
        System.out.println(name);
        return "Published Succesfully";
    }
}