package com.aastha.SpringBootApplication.mapper;

import com.aastha.SpringBootApplication.DTO.AccountDTO;
import com.aastha.SpringBootApplication.entity.Account;

public class AccountMapper {
	
	public static Account mapToAccount(AccountDTO accountDTO) {
		//convert AccountDTO to account
		Account account = new Account(
				accountDTO.getId(),
				accountDTO.getAccountHolderName(),
				accountDTO.getBalance()
		);
		
		return account;
	}
	
	public static AccountDTO mapToAccountDTO(Account account) {
		AccountDTO accountDTO = new AccountDTO(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
		);
		
		return accountDTO;
	}
}
