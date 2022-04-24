package com.example.m4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class M4Application {

	public static void main(String[] args) {
		SpringApplication.run(M4Application.class, args);
	}

}
