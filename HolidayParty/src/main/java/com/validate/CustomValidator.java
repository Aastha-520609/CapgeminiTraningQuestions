package com.validate;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator{

	public void validate(Object arg0, Errors arg1) {
		RegistrationBean register = (RegistrationBean) arg0;

        if (register.getUserName().isEmpty()) {
            arg1.rejectValue("userName", "error.userName", "User Name cannot be blank");
        }
        
        if (!register.isStatus()) {
            arg1.rejectValue("status", "error.status", "Please agree to the terms and conditions");
        }

        if (String.valueOf(register.getContactNumber()).length() != 10) {
            arg1.rejectValue("contactNumber", "error.contactNumber", "Contact Number should be of 10 digits/Contact Number should not be blank");
        }

        if (!register.getEmailId().equals(register.getConfirmEmailId())) {
            arg1.rejectValue("confirmEmailId", "error.confirmEmailId", "Email Id and Confirm Email should be same");
        }
	}

	public boolean supports(Class<?> arg0) {
		return false;
	}
	
}
