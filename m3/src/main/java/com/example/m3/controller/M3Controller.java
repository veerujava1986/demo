package com.example.m3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class M3Controller {
    @GetMapping("/m3")
    public String m1(){
        return "m3";
    }
}
