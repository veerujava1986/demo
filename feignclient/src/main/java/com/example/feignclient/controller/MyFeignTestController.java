package com.example.feignclient.controller;


import com.example.feignclient.api.MyFeignEurekaInterface;
import com.example.feignclient.api.MyFeignInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyFeignTestController {

    @Autowired
    MyFeignInteface myFeignInteface;

    @Autowired
    MyFeignEurekaInterface myFeignEurekaInterface;

    @GetMapping("/testFeignClient")
    public String testFeignClient(){
        String data=myFeignInteface.m1();
        return data;
    }




    @GetMapping("/testFeignWithEureka")
    public String testFeignWithEureka(){
        String response =myFeignEurekaInterface.getM1();
        return response;
    }


}
