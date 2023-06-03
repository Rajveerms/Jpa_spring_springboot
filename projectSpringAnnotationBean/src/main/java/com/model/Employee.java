package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address;

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("This is Employee Class info ");
		address.showAdd();
	}
}
