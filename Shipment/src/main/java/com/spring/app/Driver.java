package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Scanner sc = new Scanner(System.in);
        
        Shipment ship1 = (Shipment)context.getBean("shipment");
		System.out.println("Shipment Details 1");
		System.out.println("Enter the Item Name");
		String name1 = sc.nextLine();
		
		Item obj1 = ship1.getItem();
		obj1.setItemName(name1);
		System.out.println("Enter the Item Price");
		double price1 = sc.nextDouble();
		sc.nextLine();
		obj1.setPrice(price1);
		System.out.println("Enter the ShipmentId");
		String id1 = sc.nextLine();
		ship1.setShipmentId(id1);
		System.out.println("Enter the Delivery Status");
		String status1 = sc.nextLine();
		ship1.setDeliveryStatus(status1);
		
		Shipment ship2 = (Shipment) context.getBean("shipment");
		
		Item obj2 = ship2.getItem();
		System.out.println("Shipment Details 2");
		System.out.println("Enter the Item Name");
		String name2 = sc.nextLine();
		obj2.setItemName(name2);
		System.out.println("Enter the Item Price");
		double price2 = sc.nextDouble();
		sc.nextLine();
		obj2.setPrice(price2);
		System.out.println("Enter the ShipmentId");
		String id2 = sc.nextLine();
		ship2.setShipmentId(id2);
		System.out.println("Enter the Delivery Status");
		String status2 = sc.nextLine();
		ship2.setDeliveryStatus(status2);
		
		System.out.println("Delivery status of shipment ID:"+ship1.getShipmentId()+" is "+ship1.getDeliveryStatus());
		System.out.println("Delivery status of shipment ID:"+ship2.getShipmentId()+" is "+ship2.getDeliveryStatus());
    }
}
