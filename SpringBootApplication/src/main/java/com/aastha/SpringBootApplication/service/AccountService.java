package com.aastha.SpringBootApplication.service;

import java.util.List;
import com.aastha.SpringBootApplication.DTO.AccountDTO;

public interface AccountService {
	
	AccountDTO createAccount(AccountDTO account);
    AccountDTO getAccountById(Long id);
	AccountDTO deposit(Long id, double amount);
	AccountDTO withdraw(Long id, double amount);
	List<AccountDTO> getAllAccounts();
	void deleteAccount(Long id);
}
