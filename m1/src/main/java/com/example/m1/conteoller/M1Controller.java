package com.example.m1.conteoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class M1Controller {
    @GetMapping("/m1")
    public String m1(){
        return "m1";
    }
}
