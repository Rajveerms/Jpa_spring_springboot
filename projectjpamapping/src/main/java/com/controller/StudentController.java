package com.controller;

import javax.persistence.*;

import com.model.Course;
import com.model.Student;

public class StudentController 
{

	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stucourse");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//student object 
		Student s1 = new Student();
		Student s2 = new Student();
		
		
		
		//course object
		Course c1 = new Course(1111,"Java",s1);
		Course c2 = new Course(2222,"Python",s2);
		
		//em.persist(c1);		// when we do cascading it automatically takes child class 
		//em.persist(c2);		//when we persist parent class no need to persist child class also
		
		
		s1.setName("Rajveer");
		s1.setMarks(78);
		s1.setCourse(c1);
		
		
		s2.setName("Ram");
		s2.setMarks(75);
		s2.setCourse(c2);
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();
		
		System.out.println("Saved Entity");
		
	}

}
