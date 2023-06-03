package com.model;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee {
	
	private int salary;

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + "]";
	}

	
	
}
