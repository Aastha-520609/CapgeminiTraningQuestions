package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bean.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query("SELECT a FROM Account a JOIN a.atmCard ac WHERE LOWER(ac.cardType) = LOWER(:cardType)")
	List<Account> findByCardType(@Param("cardType") String cardType);
}
