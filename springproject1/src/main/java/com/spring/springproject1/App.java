package com.spring.springproject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Hardisk;
import com.model.Laptop;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
      Laptop lap1  =	(Laptop) context.getBean("lapi");
      System.out.println(lap1);
      
     Laptop lap2  =	(Laptop) context.getBean("lapi2");
     System.out.println(lap2);
      
     
    
    }
}
