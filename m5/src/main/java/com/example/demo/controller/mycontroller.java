package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/king")
public class mycontroller {

    @GetMapping("/test")
    public String test(@RequestParam String session_state,@RequestParam String code,HttpServletRequest req,HttpServletResponse res) throws IOException {

       // res.sendRedirect("https://veerujava1986.wordpress.com/");

        return "session_state======="+session_state+"=========code="+code;
    }
}
