package com.example.m4.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class M4TestController {

    @GetMapping("/testm4")
    public String test(){
        return "m4";
    }
}
