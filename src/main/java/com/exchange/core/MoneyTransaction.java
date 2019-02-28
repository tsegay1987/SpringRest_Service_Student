package com.exchange.core;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

 
public class MoneyTransaction {
 
	private long id;
	private String currencyFrom;
	private String currencyTo;
	private double rate;
	private double amountFrom;
	private double amountTo;
	private String date;
	private Account account;
	public MoneyTransaction() {
		
	}
	public MoneyTransaction(long id, String currencyFrom, String currencyTo, double rate, double amountFrom,
			double amountTo, String date, Account account) {
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.rate = rate;
		this.amountFrom = amountFrom;
		this.amountTo = amountTo;
		this.date = date;
		this.account = account;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getAmountFrom() {
		return amountFrom;
	}
	public void setAmountFrom(double amountFrom) {
		this.amountFrom = amountFrom;
	}
	public double getAmountTo() {
		return amountTo;
	}
	public void setAmountTo(double amountTo) {
		this.amountTo = amountTo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "MoneyTransaction [id=" + id + ", currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo
				+ ", rate=" + rate + ", amountFrom=" + amountFrom + ", amountTo=" + amountTo + ", date=" + date
				+ ", account=" + account + "]";
	}
	
	

	
}
