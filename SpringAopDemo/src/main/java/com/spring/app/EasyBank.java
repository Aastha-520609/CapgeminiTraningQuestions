package com.spring.app;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {

		balance += amount;
		System.out.println("Your balance is " + balance);
	}

	public void doWithdraw(int amount) {

		if(amount <= balance) {
			balance -= amount;
			System.out.println("You have successfully withdrawn " + amount);
		}else {
			System.out.println("Insufficient Fund");
		}

	}

	public void doChangePin(int oldPin, int pin) {
	    if (oldPin == pinCode) {
	        if (pin >= 1000 && pin <= 9999) {
	            pinCode = pin;
	            System.out.println("You have successfully changed your pin");
	        } else {
	            System.out.println("Invalid Pin");
	        }
	    } else {
	        System.out.println("Invalid Pin");
	    }
	}

	public void showBalance() {

		System.out.println("Your balance is "+ balance);
	}

}
