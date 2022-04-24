package com.example.resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class RestTemplateController {
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/testresttemplate")
    public String restTemplateTest() {

        String data = restTemplate.getForObject("http://localhost:8081/m1", String.class);

        return data;
    }

    @GetMapping("/testwitheureka")
    public String restTemplateWithEureka() {

        String data = restTemplate.getForObject("http://M1-Service/m1", String.class);

        return data;
    }


}
