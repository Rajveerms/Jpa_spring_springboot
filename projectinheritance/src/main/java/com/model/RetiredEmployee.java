package com.model;

import javax.persistence.Entity;

@Entity
public class RetiredEmployee extends Employee{

	private int pension;

	public RetiredEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RetiredEmployee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}

	@Override
	public String toString() {
		return "RetiredEmployee [pension=" + pension + "]";
	}
	
	
	
}
