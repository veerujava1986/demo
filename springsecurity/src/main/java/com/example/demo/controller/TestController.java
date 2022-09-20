package com.example.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;



@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("test")
    public String test(HttpServletRequest request){


        Enumeration<String> headers= request.getHeaderNames();

        ArrayList<String> names=new ArrayList<>();
        while (headers.hasMoreElements()){
            String s=headers.nextElement();
            names.add(s);
        }

        String authorization =request.getHeader("authorization");


        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        return "Hello!"+currentPrincipalName+names+authorization;
    }
}
