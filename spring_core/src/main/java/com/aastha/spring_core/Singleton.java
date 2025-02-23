package com.aastha.spring_core;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
    
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println("Are both instances the same? " + (obj1 == obj2));
    }
}


