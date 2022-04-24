package com.example.ssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SSLController {

    @GetMapping("/ssl")
    public String test(){
        return "Hello world!";
    }
}
