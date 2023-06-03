package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl empServiceImpl;

	@PostMapping("/add")
	public void saveEmployee()
	{
		empServiceImpl.addEmployee();
	}

	@PostMapping("/del")
	public void delEmployee()
	{
		empServiceImpl.deleteAllData();
	}

	
}
