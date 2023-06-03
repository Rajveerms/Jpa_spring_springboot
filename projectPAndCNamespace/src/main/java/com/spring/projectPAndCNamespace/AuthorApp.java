package com.spring.projectPAndCNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Author;

public class AuthorApp {

	public static void main(String[] args) {
		
		 System.out.println( "Hello World!" );
	        
	        ApplicationContext context = new ClassPathXmlApplicationContext("author.xml");
	        
	        Author code = (Author) context.getBean("auth");
	        	System.out.println(code);

	}

}
