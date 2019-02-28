package com.exchange.dao;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.exchange.core.Account;

public interface AccountDaoRepository extends PagingAndSortingRepository<Account, Long>{

	 
	

}
