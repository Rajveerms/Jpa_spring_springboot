package com.spring.projectsetterinjectionwithcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Restaurent;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        	Restaurent rs = (Restaurent) context.getBean("res");
        		rs.display();
    }
}
