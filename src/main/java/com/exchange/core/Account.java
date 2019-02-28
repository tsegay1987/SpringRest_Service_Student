package com.exchange.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

@Entity @Table(name="ACCOUNT") @XmlRootElement 
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ACCOUNTID")
	private long id;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="PAYPALL_EMAIL")
	private String payPalEmail;
	@Column(name="DATEOFBIRTH")
	private String dateOFBirth;
	@Column(name="RESIDENCE")
	private String countryOfResidence;
	
	public Account() {
		
	}

	public Account(long id, String firstName, String lastName, String contactEmail, String payPalEmail,
			String dateOFBirth, String countryOfResidence) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactEmail = contactEmail;
		this.payPalEmail = payPalEmail;
		this.dateOFBirth = dateOFBirth;
		this.countryOfResidence = countryOfResidence;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getPayPalEmail() {
		return payPalEmail;
	}

	public void setPayPalEmail(String payPalEmail) {
		this.payPalEmail = payPalEmail;
	}

	public String getDateOFBirth() {
		return dateOFBirth;
	}

	public void setDateOFBirth(String dateOFBirth) {
		this.dateOFBirth = dateOFBirth;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactEmail="
				+ contactEmail + ", payPalEmail=" + payPalEmail + ", dateOFBirth=" + dateOFBirth
				+ ", countryOfResidence=" + countryOfResidence + "]";
	}
	
	

}
