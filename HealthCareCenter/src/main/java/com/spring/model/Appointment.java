package com.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Appointment {
	
	private String patientName; 		
	private int age;
	private String phoneNumber;	
	private String consultationFor;
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getConsultationFor() {
		return consultationFor;
	}
	
	public void setConsultationFor(String consultationFor) {
		this.consultationFor = consultationFor;
	}
}
