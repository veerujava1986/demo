package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import service.EmployeeService;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


	@Value("${dbname}")
	private String dbname;

	@Autowired
	Environment environment;

	@Autowired
	EmployeeService employeeService;



	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("###########"+employeeService.testService());
		System.out.println("DATABASENAME="+dbname);

		Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);
		//System.out.println("PROFILES"+environment.getActiveProfiles());
	}
}
