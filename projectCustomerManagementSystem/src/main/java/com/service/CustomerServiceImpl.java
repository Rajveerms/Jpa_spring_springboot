package com.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.*;


import com.dao.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRepo;

	
	public void addCustomer()
	{
		ArrayList<Customer> custList = new ArrayList<Customer>();
			custList.add(new Customer("Veer",30000));
			custList.add(new Customer("Raj",35000));
			custList.add(new Customer("Ram",40000));
			
			for(Customer c : custList)
			{
				custRepo.save(c);
			}
			
	}
	@Override
	public void deleteAllData() 
	{
			custRepo.deleteAll();
	}

	@Override
	public String deleteCustomer(int cId) {
			custRepo.deleteById(cId);
		return "Customer Removed ! "+cId;
	}


	@Override
	public List<Customer> saveCustomer(List<Customer> customer) {
		return custRepo.saveAll(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer existingcustomer = custRepo.findById(customer.getcId()).orElse(customer);
		System.out.println(customer.getcId()+customer.getCname());
		
		existingcustomer.setCname("Ravishankar");
		existingcustomer.setTotalAmount(50000);
		
		return custRepo.save(existingcustomer);
	}
	
	@Override
	public void addNewCustomer(Customer customer) {
		 custRepo.save(customer);
		
	}

}
