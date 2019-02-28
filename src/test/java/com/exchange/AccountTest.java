package com.exchange;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exchange.ExchangeApplication;
import com.exchange.core.Account;
import com.exchange.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ExchangeApplication.class})
public class AccountTest {
	@Autowired
	private AccountService service;

//	@Test
//	public void testGetById() {
//		Collection<Account> acc = service.getAll();
//		System.out.println(acc);
//		//assertThat(acc.getFirstName(), equalTo("Fred"));
//	}
	@Test
	public void testAdd() {
		Account acc1 = new Account(23, "Tsegay", "Gebrewahd","ts@gmai.com" ,"paypalemail", "09-09-1987", "Atlanta");
		long acc2 = service.add(new Account(23, "Tsegay", "Gebrewahd","ts@gmai.com" ,"paypalemail", "09-09-1987", "Atlanta"));
		System.out.println(acc2);
		System.out.println("==========="+acc1+"================");
		//assertThat(acc.getFirstName(), equalTo("Fred"));
	}
	
	

}
