package com.model;

import javax.persistence.*;

@Entity
public class Account 
{
	@Id
	private int id;
	private String accountType;
	
	@OneToOne
	private Customer customer;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int id, String accountType, Customer customer) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", customer=" + customer + "]";
	}

	
	
}
