package com.component.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.component.model.*;

public class TestComponentApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Employee e = context.getBean(Employee.class);
    	e.display();

	}

}
