package com.aastha.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to spring boot application";
	}
}
