package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerServiceImpl;

@RestController
public class CustomerController {

	@Autowired
	CustomerServiceImpl custServiceImpl;

	@PostMapping("/add")
	public void saveEmployee()
	{
		custServiceImpl.addCustomer();
	}
	
	@DeleteMapping("/delete")
	public void delete()
	{
		custServiceImpl.deleteAllData();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int cId)
	{
		custServiceImpl.deleteCustomer(cId);
		return "Customer Deleted Id Wise";
		
	}
	
	@PostMapping("/addcustomers")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers)
	{
		return custServiceImpl.saveCustomer(customers);	
	}
	
	@PutMapping("/update")
	public Customer UpdateCustomer(@RequestBody Customer customer)
	{
		return custServiceImpl.updateCustomer(customer);
	}
}
