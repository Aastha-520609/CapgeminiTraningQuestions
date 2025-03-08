package com.validate;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;


public class CustomValidator implements Validator{

	public void validate(Object arg0, Errors arg1) {
		RegistrationBean register = (RegistrationBean) arg0;

        if (register.getUserName() == null || register.getUserName().isEmpty()) {
            arg1.rejectValue("userName", "userName.empty", "User Name cannot be blank");
        }

        if (String.valueOf(register.getContactNumber()).length() != 10) {
            arg1.rejectValue("contactNumber", "contactNumber.invalid", "Contact Number should be of 10 digits");
        }

        if (register.getEmailId() == null || register.getEmailId().isEmpty()) {
            arg1.rejectValue("emailId", "emailId.empty", "Email ID cannot be blank");
        }

        if (!register.getEmailId().equals(register.getConfirmEmailId())) {
            arg1.rejectValue("confirmEmailId", "confirmEmailId.mismatch", "Email Id and Confirm Email should be same");
        }

        if (!register.isStatus()) {
            arg1.rejectValue("status", "status.unchecked", "Please agree to the terms and conditions");
        }
	}

	public boolean supports(Class<?> arg0) {
		return RegistrationBean.class.equals(arg0);
	}
	
}
