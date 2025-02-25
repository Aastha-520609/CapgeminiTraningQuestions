package com.spring.app;


import java.time.LocalDate;


import org.apache.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspect {
	final static Logger logger = Logger.getLogger("BankAspect.class");
	
	@Around("execution(* com.spring.app.Bank.withDraw(..))")
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("Date: " + LocalDate.now() + ", Message: Before Method Called");
		
		Object status = pjp.proceed();
		
		logger.info("Status: " + status);
		
		return status;
    }

	
}