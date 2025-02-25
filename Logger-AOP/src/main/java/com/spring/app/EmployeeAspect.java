package com.spring.app;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	

final static Logger logger = Logger.getLogger("EmployeeAspect.class");

@After("execution(* com.spring.app.Company.registerEmployee(..))")
public void logRegistrationStatus(){
		logger.info("Date: " + LocalDateTime.now() + " - Registration Successful");
}

}