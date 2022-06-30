package com.example.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient// optional
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
		//hello
	}

}
