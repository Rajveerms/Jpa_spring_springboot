package com.controllerjpql;

import java.util.List;

import javax.persistence.*;

import com.modeljpql.Laptop;

public class LaptopController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Laptop");
		
		EntityManager em = emf.createEntityManager();
		
		/*
		Laptop laptop = new Laptop();
		Laptop laptop1 = new Laptop();
		Laptop laptop2= new Laptop();
		
		laptop.setId(101);
		laptop.setName("Lenevo");
		laptop.setPrice(15000);
		
		laptop1.setId(102);
		laptop1.setName("Hp");
		laptop1.setPrice(16000);
		
		laptop2.setId(103);
		laptop2.setName("Dell");
		laptop2.setPrice(15000);
		
		em.getTransaction().begin();
		em.persist(laptop);
		em.persist(laptop1);
		em.persist(laptop2);
		em.getTransaction().commit();
	*/	
		
		//List Of Laptop Names
		
		/*
		Query q = em.createQuery("select lap.name from Laptop as lap ");
		List<String> names = q.getResultList();
		
		
		System.out.println("Name Of Laptops : \n ");
		for(String s : names)
		{
			System.out.println(s);
		}
		
	
		 */
	
	//List Of data of Laptops 
		
	/*	
		Query q = em.createQuery("select lap from Laptop as lap ");
		List<Laptop> names = q.getResultList();
		
		System.out.println("Details Of Laptops : \n ");
		
		for(Laptop s: names )
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPrice());
		}
		
	*/
		
		//Price Between 10k to 15k
		/*
		Query q = em.createQuery("select lap from Laptop as lap where price between 20000 and 45000 ");
		List<Laptop> names = q.getResultList();
		
		System.out.println("Details Of Laptops : \n ");
		
		for(Laptop s: names )
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPrice());
		}
		*/
		
	//updating data 
	// select lap from Laptop as lap
	/*
		em.getTransaction().begin();
		Query q = em.createQuery("update Laptop set price=35000 where id=102 ");
		q.executeUpdate();
		em.getTransaction().commit();
		
	*/

	
	
	//delete data from db
	/*	
		em.getTransaction().begin();
		Query q = em.createQuery("Delete from Laptop where id=103");
		q.executeUpdate();
		em.getTransaction().commit();
	*/	
	
		
	//how much laptops are present 	
	/*
		Query q = em.createQuery("select count(lap) from Laptop as lap");	
	
		System.out.println("Number Of Laptop is Present : \n "+	q.getSingleResult());
	*/
		
	//max
	/*
		Query q = em.createQuery("select MAX(lap.price) from Laptop as lap");			
		System.out.println("Maximum Price of Laptop : \n "+	q.getSingleResult());
	*/
		
	//min
	/*		
		Query q = em.createQuery("select MIN(lap.price) from Laptop as lap");			
		System.out.println("Minimum Price of Laptop : \n "+	q.getSingleResult());
	*/			
		

		
	}
}
