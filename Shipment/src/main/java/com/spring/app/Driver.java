package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Scanner scanner = new Scanner(System.in);

        Shipment[] shipments = new Shipment[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Shipment Details " + (i + 1));

            Shipment shipment = (Shipment) context.getBean("shipment");

            System.out.println("Enter the Item Name");
            shipment.getItem().setItemName(scanner.nextLine());

            System.out.println("Enter the Item Price");
            shipment.getItem().setPrice(scanner.nextDouble());
            scanner.nextLine(); // Consume newline

            System.out.println("Enter the ShipmentId");
            shipment.setShipmentId(scanner.nextLine());

            System.out.println("Enter the Delivery Status");
            shipment.setDeliveryStatus(scanner.nextLine());

            shipments[i] = shipment;
        }

        for (Shipment shipment : shipments) {
            System.out.println("\nDelivery status of shipment ID: " +
                shipment.getShipmentId() + " is " + shipment.getDeliveryStatus());
        }
    }
}
