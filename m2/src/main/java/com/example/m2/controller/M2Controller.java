package com.example.m2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class M2Controller {
    @GetMapping("/m2")
    public String m1(){
        return "m2";
    }
}
