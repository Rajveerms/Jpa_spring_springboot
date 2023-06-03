package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLapHard {

	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Laptop p = 	(Laptop) context.getBean("laptop");
		
			System.out.println(p);
	}

}