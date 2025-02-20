package com.aastha.spring_core1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
//	@Value("MRF")
    private String brand;

//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}

	public Tyre(@Value("MRF")String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return brand;
	}
	
	
	
}
