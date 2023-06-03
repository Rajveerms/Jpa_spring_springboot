package com.model;

import javax.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cname;
	private int totalAmount;
	
	public Customer() {
		super();
	}

	public Customer(String cname, int totalAmount) {
		super();
		this.cname = cname;
		this.totalAmount = totalAmount;
	}

	public Customer(int cId, String cname, int totalAmount) {
		super();
		this.cId = cId;
		this.cname = cname;
		this.totalAmount = totalAmount;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
