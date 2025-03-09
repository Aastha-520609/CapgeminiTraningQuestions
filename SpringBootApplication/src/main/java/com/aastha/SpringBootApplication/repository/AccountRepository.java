package com.aastha.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aastha.SpringBootApplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
