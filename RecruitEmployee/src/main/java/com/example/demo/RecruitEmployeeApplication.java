package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.controller", "com.service", "com.validate", "com.model"})
public class RecruitEmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(RecruitEmployeeApplication.class, args);
	}

}
