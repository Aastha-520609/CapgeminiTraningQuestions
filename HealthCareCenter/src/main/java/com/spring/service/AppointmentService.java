package com.spring.service;

import org.springframework.stereotype.Service;

import com.spring.model.Appointment;

@Service
public class AppointmentService {
	
	public int bookAppointment(Appointment appointment)  {			
		 
		switch(appointment.getConsultationFor()) {
			case "Optometry": return 500;
			case "Psychology": return 350;
			case "Pediatrist": return 750;
			case "Physical therapy": return 400;
			case "Dentistry": return 450;
			default: return 0;
		}
	}

}
