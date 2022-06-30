package com.example.keycloak.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyCloakTestController {

    @GetMapping("/m5")
    public String testKeycloak(){
        return "m5";
    }
}
