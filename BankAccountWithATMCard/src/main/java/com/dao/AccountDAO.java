package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.bean.CurrentAccount;
import com.bean.SavingsAccount;
import com.repository.AccountRepository;


@Service
public class AccountDAO {
	private static final Logger logger = LoggerFactory.getLogger(AccountDAO.class);
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void openAccount(Account account) {
	    accountRepository.save(account);
	    logger.info("Account with id {} added successfully", account.getAccountNumber());
	}

	public List<Account> retrieveAccountBasedOnCardType(String cardType) {
	    List<Account> accounts = accountRepository.findByCardType(cardType);

	    if (accounts.isEmpty()) {
	        logger.error("No account with this card type {}", cardType);
	    } else {
	        logger.info("Account details with card type {} retrieved successfully", cardType);
	    }

	    return accounts;
	}

}
