package com.spring.projectcustomerorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
        Customer cus = (Customer) context.getBean("cust");
        	cus.display();
    }
}
