package com.cnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCoder {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("coder.xml");
		
		Coder coder =	 (Coder) context.getBean("code");
		System.out.println(coder);
	}

}
