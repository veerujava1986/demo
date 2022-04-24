package com.example.feignclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url = "http://M1-Service",name = "FEIGN-EUREKA-CLIENT")
public interface MyFeignEurekaInterface {

    @GetMapping("/m1")
    public String getM1();
}
