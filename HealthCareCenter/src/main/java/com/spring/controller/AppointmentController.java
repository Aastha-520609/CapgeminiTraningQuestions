package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.spring.model.Appointment;
import com.spring.service.AppointmentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppointmentController {
	
	@Autowired
	private AppointmentService service;
	
	@GetMapping("/showPage")
	public String showPage(@ModelAttribute("appointment") Appointment appointment) {
	    return "showPage";
	}
	
	@ModelAttribute("consultationList")
	public List<String> populateConsultation(){
		List<String> consultationList = new ArrayList<>();
		consultationList.add("Optometry");
		consultationList.add("Psychology");
		consultationList.add("Pediatrist");
		consultationList.add("Physical therapy");
		consultationList.add("Dentistry");
		return consultationList;
	}

	@PostMapping("/consultation")
	public String bookAppointment(@ModelAttribute("appointment") Appointment appointment, ModelMap model) {		
			
		    int charges = service.bookAppointment(appointment);	
			model.addAttribute("message", "Thanks for visiting. Your consultation charges is Rs. " + charges);
			return "showPage";
	}
	
}
