package com.controller;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Actor;
import com.model.Movie;

public class TestController 
{

	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("movie");
		EntityManager em = emf.createEntityManager();
		

		 	em.getTransaction().begin();
		Actor a1 = new Actor();
		
		
		Movie m1 = new Movie(101,"Singham");
		Movie m2 = new Movie(102,"Drishyam");
		
		em.persist(m1);
		em.persist(m2);
		
		List<Movie> movieList = new ArrayList<Movie>(); 	
		movieList.add(m1);
		movieList.add(m2);
		
		a1.setId(1);
		a1.setName("Ajay");
		a1.setMovies(movieList);
		
		em.persist(a1);
		
		em.getTransaction().commit();
		System.out.println("Saved Actor's Movie's ");
		
	}

}
