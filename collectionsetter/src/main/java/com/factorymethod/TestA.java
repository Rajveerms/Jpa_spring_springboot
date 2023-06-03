package com.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	public static void main(String args[])
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
		A a =	(A) context.getBean("a");
				a.msg();
	}	
}
