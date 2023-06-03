package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.model.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;
	
	public void addEmployee()
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ram","Rajputana"));
		emp.add(new Employee("Rajeer","Satara"));
		emp.add(new Employee("Vishal","Pune"));
		emp.add(new Employee("Veer","Pimple Gurav"));
		
		for(Employee e : emp)
		{
			employeeRepo.save(e);
		}
	}

	
	@Override
	public void deleteAllData() {
		employeeRepo.deleteAll();
	}
}
