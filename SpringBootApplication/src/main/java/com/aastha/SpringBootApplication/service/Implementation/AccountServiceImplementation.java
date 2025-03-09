package com.aastha.SpringBootApplication.service.Implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.aastha.SpringBootApplication.DTO.AccountDTO;
import com.aastha.SpringBootApplication.entity.Account;
import com.aastha.SpringBootApplication.mapper.AccountMapper;
import com.aastha.SpringBootApplication.repository.AccountRepository;
import com.aastha.SpringBootApplication.service.AccountService;

@Service
public class AccountServiceImplementation implements AccountService{
	
	private AccountRepository accountRepository;

	//Spring automatically injects the dependencies via constructor injection.
	public AccountServiceImplementation(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}


    //convert accountDTO into jpa entity then account jpa entity to database - create a mapper class for doing it
	@Override
	public AccountDTO createAccount(AccountDTO accountDTO) {
		Account account = AccountMapper.mapToAccount(accountDTO);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDTO(savedAccount);
	}


	@Override
	public AccountDTO getAccountById(Long id) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		
		return AccountMapper.mapToAccountDTO(account);
	}


	@Override
	public AccountDTO deposit(Long id, double amount) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account does not exists"));
		
		double total = account.getBalance() + amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDTO(savedAccount);
	}
	
	@Override
	public AccountDTO withdraw(Long id, double amount) {
	    Account account = accountRepository
	    		          .findById(id)
	    		          .orElseThrow(() -> new RuntimeException("Account does not exists"));
	    
	    double total = account.getBalance() - amount;
	    account.setBalance(total);
	    Account savedAccount = accountRepository.save(account);
	    
		return AccountMapper.mapToAccountDTO(savedAccount);
	}


	@Override
	public List<AccountDTO> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		
		return accounts.stream().map((account) -> AccountMapper.mapToAccountDTO(account))
		        .collect(Collectors.toList());
	}


	@Override
	public void deleteAccount(Long id) {
		
		Account account = accountRepository
				          .findById(id)
				          .orElseThrow(() -> new RuntimeException("Account does not exists"));
		
		accountRepository.deleteById(id);
	}
}
