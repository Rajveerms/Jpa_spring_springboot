package com.model;

public class Employee {

	
	private int empId;
	private String empName;
	
	private Address address;
	
	//constructors
	
	public Employee() {
		super();
	}

	
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}


	// Getter & Setters 
		
		public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	// To String Method 
	
	public void display()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Address : "+address);
	}
}
