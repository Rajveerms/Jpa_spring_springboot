package com.spring.projectemployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = (Employee) context.getBean("emp");
        	employee.display();
        	
        Employee employee1 = (Employee) context.getBean("emp1");
        	employee.display();
    }
}
