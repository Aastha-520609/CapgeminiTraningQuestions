package com.aastha.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer {
	
	@Autowired
	@Qualifier("desktop")
	private Computer device;
	
	public void build() {
		
		device.compile();
		System.out.println("Build project using concepts of spring boot");
	}

}
