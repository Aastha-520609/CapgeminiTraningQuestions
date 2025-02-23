package com.spring.app;


 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Account;

public class Driver {
	
	
	public static Account loadAccount()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		return (Account) context.getBean("accountObj");
	}

	public static void main(String[] args) 
	{
        Account account = loadAccount();
        account.displayDetails();
	}	 	  	    	    		        	 	


}
