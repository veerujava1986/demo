package com.example.feignclient.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081",name = "CLIENT")
public interface MyFeignInteface {

    @GetMapping("/m1")
    public String m1();
}
