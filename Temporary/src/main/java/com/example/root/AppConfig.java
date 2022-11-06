package com.example.root;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "mystring",autowireCandidate = false,destroyMethod = "",initMethod = "",value = "")
    public String getStr(){
        return new String("hello");
    }
}
