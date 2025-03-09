package com.validate;
import com.model.Candidate;

import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class CustomValidator implements Validator {
    
    public boolean supports(Class<?> clazz) {
        return clazz == Candidate.class;
    }
    
	public void validate(Object arg0, Errors arg1) {
		
		//fill code to do validation for candidate name and contact number
		Candidate candidate  = (Candidate) arg0;
		
		String name = candidate.getCandidateName();
	    if (!name.matches("[a-zA-Z ]+") || name.length() < 3 || name.length() > 10) {
	        arg1.rejectValue("candidateName", "name.invalid",
	                "Name should contain only alphabets and space, min 3 chars and max 10 chars");
	    }

	    String contact = candidate.getContactNumber();
	    if (!contact.matches("[6-9][0-9]{9}")) {
	        arg1.rejectValue("contactNumber", "contact.invalid",
	                "Contact Number should be 10 digits and start with 6-9");
	    }
 	}

}
