package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class CircuitBrakerPatternHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBrakerPatternHystrixApplication.class, args);
	}

}
