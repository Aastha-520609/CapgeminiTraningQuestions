package com.aastha.spring_Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This class is responsible for providing the objects

@Configuration
public class Config{
	
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}

}
