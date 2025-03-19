package com.controller;

import java.util.ArrayList;
import java.util.Arrays;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Candidate;
import com.service.RecruitService;
import com.validate.CustomValidator;


@Controller
public class RecruitController {
	
	@Autowired
    private CustomValidator custValidator;

	@Autowired
    private RecruitService service;

	@GetMapping("/showCandidatePage")
	public String showPage(@ModelAttribute("candidate")Candidate candidate) {			
		
		return "showPage";
	}
	
	@GetMapping("/home")
	public String showIndexPage() {	

		return "index";		
	}
	
	@ModelAttribute("positionDtls")
	public  ArrayList<String> populatePositionDtls(){		

		return new ArrayList<>(Arrays.asList("TL", "PL", "Developer", "Tester", "Admin"));		
	}	 	  	  		    	   	 	   	 	

	
	@PostMapping("/register")
	public String registerCandidate(@ModelAttribute("candidate") @Valid Candidate candidate, BindingResult result,ModelMap model) {
		
		custValidator.validate(candidate, result);
		if(result.hasErrors()) {
			return "showPage";
		}
		service.insertCandidate(candidate);
        model.addAttribute("message", "Welcome " + candidate.getCandidateName() + "!!!");
        return "success";
	}
	
	
	@GetMapping("/viewAllCandidateList")
	public String viewAllCandidates(ModelMap model) {				

		model.addAttribute("candidates",service.viewAllCandidates());
		
		return "viewList";		 				
	}
	
}
