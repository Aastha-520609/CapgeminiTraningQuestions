package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cart cart = (Cart) context.getBean("cart");

        System.out.println("Total Price Rs: " + cart.calculateTotalPrice());
	}
}
