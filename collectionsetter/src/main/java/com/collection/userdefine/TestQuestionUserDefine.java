package com.collection.userdefine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestionUserDefine {

	public static <Quest> void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("userdef.xml");
		
		Question	quest = 	(Question) context.getBean("que1");
			
			quest.display();
	}

}
