package com.service;



import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	public void addCustomer();
	
	void deleteAllData();
	
	String deleteCustomer(int cId);

	List<Customer> saveCustomer(List<Customer> customer);
	
	Customer updateCustomer(Customer customer);

	void addNewCustomer(Customer customer);
	
	//ArrayList<Customer> findAllCustomer();
	//Customer findAllCustomerById(int cId);
	
	

	//List<Customer> getCustomer();
	
}
