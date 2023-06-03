package com.spring.projectcollectionobjectuserdefine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Collection With Object User Define : ");
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Question  qs = (Question) context.getBean("qus");
        		qs.display();
        		
        		System.out.println("\n");
        		
       Question  qs2 = (Question) context.getBean("qus2");
         		qs2.display();	
         		
         		System.out.println("\n");
        		
     Question  qs3 = (Question) context.getBean("qus3");
                qs3.display();	
        
    }
}
