package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ATMCard;
import com.bean.Account;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;

@Service
public class ATMCardDAO {
	private static final Logger logger = LoggerFactory.getLogger(ATMCardDAO.class);
	
	@Autowired
	private ATMCardRepository atmCardRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObject) {
	    Account account = accountRepository.findById(accountNumber)
	            .orElseThrow(() -> new RuntimeException("Account Not Found"));

	    if (account.getAtmCard() != null) {
	        logger.error("ATM card not issued to account number {}", accountNumber);
	        return;
	    }

	    atmCardObject.setAccount(account);
	    account.setAtmCard(atmCardObject);

	    atmCardRepository.save(atmCardObject);
	    accountRepository.save(account);

	    logger.info("ATM card successfully issued to account number {}", accountNumber);
	}


}
