package com.controller;

import javax.persistence.*;

import com.model.RegularEmployee;
import com.model.RetiredEmployee;

public class EmployeeController 
{

	public static void main(String args[])
	{
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
			EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
	
		RegularEmployee regemp = new RegularEmployee();
			regemp.setId(1);
			regemp.setName("Bhoma");
		    regemp.setSalary(50000);
		
		em.persist(regemp);
		
		RetiredEmployee retemp = new RetiredEmployee();
		retemp.setId(2);
		retemp.setName("Avdhoot");
		retemp.setPension(50000);
		
		em.persist(retemp);
				
		em.getTransaction().commit();
		
		
		
		
		
	}
}
