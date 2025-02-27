package com.aastha.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
		
		Developer obj = context.getBean(Developer.class);
		obj.build();
	}

}
