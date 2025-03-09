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

import com.model.Candidate;
import com.service.RecruitService;
import com.validate.CustomValidator;

@Controller
public class RecruitController {
	
    @Autowired
    private CustomValidator custValidator;

    @Autowired
    private RecruitService service;

    @GetMapping("/home")
    public String showIndexPage() {	
        return "index";		
    }
	
    @GetMapping("/showCandidatePage")
    public String showPage(@ModelAttribute("candidate") Candidate candidate) {			
        return "showPage";
    }
	
    @ModelAttribute("positionDtls")
    public ArrayList<String> populatePositionDtls(){		
        return new ArrayList<>(Arrays.asList("TL", "PL", "Developer", "Tester", "Admin"));		
    }	 	  	  		    	   	 	   	 	

    @PostMapping("/register")
    public String registerCandidate(@ModelAttribute("candidate") @Valid Candidate candidate, BindingResult result, ModelMap model) {
        if (custValidator == null || service == null) {
            throw new IllegalStateException("Dependencies not injected properly in registerCandidate");
        }
        
        try {
            custValidator.validate(candidate, result);
        } catch (Exception e) {
            // Log the exception if logger were available (can't modify logger.xml, so handle silently here)
            return "showPage"; // Return to showPage with errors
        }
		
        if (result.hasErrors()) {
            return "showPage";
        }
		
        try {
            service.insertCandidate(candidate);
        } catch (Exception e) {
            // Log the exception if logger were available (can't modify logger.xml, so handle silently here)
            model.addAttribute("error", "Failed to register candidate: " + e.getMessage());
            return "showPage"; // Return to showPage with an error message
        }
        
        model.addAttribute("candidateName", candidate.getCandidateName());
        return "success";		
    }
	
    @GetMapping("/viewAllCandidateList")
    public String viewAllCandidates(ModelMap model) {				
        if (service == null) {
            throw new IllegalStateException("RecruitService not injected properly in viewAllCandidates");
        }
        
        try {
            model.addAttribute("candidates", service.viewAllCandidates());
        } catch (Exception e) {
            // Log the exception if logger were available (can't modify logger.xml, so handle silently here)
            model.addAttribute("error", "Failed to view candidates: " + e.getMessage());
            return "index"; // Fallback to index page with an error message
        }
        return "viewList";		 				
    }
	
}