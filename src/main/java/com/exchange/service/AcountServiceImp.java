package com.exchange.service;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.exchange.core.Account;
import com.exchange.dao.AccountDaoRepository;


@Component
public  class AcountServiceImp  implements AccountService{
	@Inject  
	private AccountDaoRepository repo;
	
	//----------
	 

	@Override
	public Collection<Account> getAll() {
		
		return (Collection<Account>) repo.findAll();
 	}
 
	 
	@Override
	public long add(Account account) {
		 repo.save(account);
		 return account.getId();
	}



	@Override
	public Account get(long id) {
	 	return repo.findById(id).get();
	}

	 
 
}


