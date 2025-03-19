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
    
	public void validate(Object arg0,Errors arg1) {
		
		
		Candidate candidate = (Candidate) arg0;
		
		//validating candidate name
		if (candidate.getCandidateName() != null && !candidate.getCandidateName().isBlank()) {
            if (!candidate.getCandidateName().matches("^[A-Za-z ]{3,10}$")) {
            	arg1.rejectValue("candidateName", "invalid.name", "Name should contain only alphabets and space min 3 chars and max 10 chars");
            }
        }

        //validating the number
        if (candidate.getContactNumber() != null && !candidate.getContactNumber().isBlank()) {
            if (!candidate.getContactNumber().matches("^[6-9]\\d{9}$")) {
            	arg1.rejectValue("contactNumber", "invalid.contact", "Contact Number should be of 10 digits/Contact Number should start with range 6 to 9");
            }
        }
 	}

}
