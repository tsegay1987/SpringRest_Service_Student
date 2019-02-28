package com.exchange.core;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


public class ExchangeRate {
	
	
	private long id;
	private String currencyFrom;
	private String currencyTo;
	private String DateOfTransaction;
	private double rate;
	public ExchangeRate() {
		
	}
	public ExchangeRate(long id, String currencyFrom, String currencyTo, String dateOfTransaction, double rate) {
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		DateOfTransaction = dateOfTransaction;
		this.rate = rate;
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
	public String getDateOfTransaction() {
		return DateOfTransaction;
	}
	public void setDateOfTransaction(String dateOfTransaction) {
		DateOfTransaction = dateOfTransaction;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "ExchangeRate [id=" + id + ", currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo
				+ ", DateOfTransaction=" + DateOfTransaction + ", rate=" + rate + "]";
	}
	
	
	

}
