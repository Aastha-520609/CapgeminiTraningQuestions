package com.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
public class Account {
	
	@Id
	private int accountNumber;
	private String holderName;
	private  double balance;
    
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
	private ATMCard atmCard;
	
	public Account() {
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public ATMCard getAtmCard() {
		return atmCard;
	}
	
	public void setAtmCard(ATMCard atmCard) {
		this.atmCard = atmCard;
		if (atmCard != null) {
	        atmCard.setAccount(this);
	    }
	}
}
