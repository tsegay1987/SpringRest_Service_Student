package com.exchange.service;

import java.util.Collection;

import com.exchange.core.Account;

public interface AccountService {

	 

	Collection<Account> getAll();

	Account get(long id);
 

	long add(Account account);
 

}
