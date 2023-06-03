package com.spring.projectsinglton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "SingleTon" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        User user1  =	(User) context.getBean("user");
        System.out.println(user1.getName());
        
        user1.setName("Rajveer");
        System.out.println(user1.getName());
        
        User user2 = (User) context.getBean("user");
        	System.out.println(user2.getName());
        	
        	System.out.println(user1);
        	System.out.println(user2);
        	
        	
       System.out.println("*******************************************************");
       
       System.out.println( "prototype" );
       
       ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
       
       User user3  =	(User) context.getBean("user2");
       System.out.println(user3.getName());
       
       user3.setName("Rajveer");
       System.out.println(user3.getName());
       
       User user4 = (User) context.getBean("user2");
       	System.out.println(user4.getName());
       	
       	System.out.println(user3);
       	System.out.println(user4);
        	
        	
        	
    }
}
