package com.aastha.spring_core1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;
	
//	public Tyre getTyre() {
//		return tyre;
//	}
//
//	public void setTyre(Tyre tyre) {
//		this.tyre = tyre;
//	}
	
	public Car(Tyre tyre) {
		super();
		this.tyre = tyre;
	}

	public void drive() {
		// System.out.println("Car is running with " + tyre.getBrand() + " tyres.");
		System.out.println("Car is running with " + tyre + " tyres.");
	}
}
