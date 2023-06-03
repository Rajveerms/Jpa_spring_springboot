package com.controllerjpql;

import java.util.*;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.modeljpql.Author;
import com.mysql.*;

public class AuthorController {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Laptop");
		
		EntityManager em = emf.createEntityManager();

	
		Author author = new Author(1,"Nepolian Hill");
		Author author1 = new Author(2,"Sudha Murthy");
		Author author2 = new Author(3,"rabindranath Tagore");
		
		
		
	/*	
		
		em.getTransaction().begin();
		em.persist(author);
		em.persist(author1);
		em.persist(author2);
		em.getTransaction().commit();
		
	*/
		
		//Name Of Author 
		
		Query q =  em.createNamedQuery("find name");
		List<String> list = q.getResultList();
		
		System.out.println("Details Of A : \n ");
		
		for(String s: list )
		{
			System.out.println(s);
		}
		
		//number of author 
		Query q1 =  em.createNamedQuery("find count");
		System.out.println("Number of Authors : "+q1.getSingleResult());		
		
	}

}
