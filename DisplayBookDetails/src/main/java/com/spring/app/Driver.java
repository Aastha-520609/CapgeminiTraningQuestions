package com.spring.app;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static Order loadBookDetails() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		return context.getBean(Order.class);
	}

	public static void main(String[] args) {
		Order order = loadBookDetails();
		 if (order != null) {
	            order.displayOrderDetails();
	        } else {
	            System.out.println("Failed to load order details.");
	        }
	}
}
