package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GoldRateInfo goldRateInfo = (GoldRateInfo)context.getBean("rateInfoObj");
		return goldRateInfo;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the carat:");
		int carat = sc.nextInt();
		
		System.out.println("Enter Total Grams:");
		int grams = sc.nextInt();
		
		GoldRateInfo goldRateInfo = loadGoldRateDetails();
		
		 double totalRate = goldRateInfo.calculateGoldRate(carat, grams);
	     System.out.println("Total Gold Rate is Rs:" + totalRate);
	}
}
	 	  	    	    		        	 	
