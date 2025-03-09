package com.aastha.SpringBootApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //lombok annotations
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts") //configuring table
@Entity //makes the class a JPA Entity
public class Account {
	
	@Id  //making id as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates IDs
	private Long id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	private double balance;
}
