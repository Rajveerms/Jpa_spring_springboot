package com.pnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuthor {

	public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
			
				Author author = 	 (Author) context.getBean("auth");
				System.out.println(author);
	}

}
