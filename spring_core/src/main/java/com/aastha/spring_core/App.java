package com.aastha.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Car car = new Car();
        //car.drive();
    	
    	//Bike obj = new Bike();
    	//obj.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Need to typecast to vehicle because getBean gives us an object and conversion of object
    	//to vehicle is not possible
    	
    	//Vehicle car = (Vehicle) context.getBean("carBean");
    	//car.drive();
    	
    	Tyre tyre = (Tyre)context.getBean("tyre");
    	System.out.println(tyre);
    }
}
