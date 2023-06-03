package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Account;
import com.model.Customer;

public class TestController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cust");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Customer c1 = new Customer();
		
		Account a1 = new Account(3811,"Saving Account",c1);

		//em.persist(a1);
		
		c1.setName("Ram");
		c1.setAccount(a1);
		
		em.persist(c1);
		em.getTransaction().commit();
		
		System.out.println("Customer Data Is Saved ...! ");
	}

}
