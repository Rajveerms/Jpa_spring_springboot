package com.spring.projectCollectionObjectUserDefineRestorent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Restorent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " Restorent Famous Dish : " );
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Restorent  rs1 = (Restorent) context.getBean("res1");
        		   rs1.display();
        		
        		System.out.println("\n");
        		
        Restorent  rs2 = (Restorent) context.getBean("res2");
         		   rs2.display();	
         		
         		System.out.println("\n");
        		
        Restorent  rs3 = (Restorent) context.getBean("res3");
                   rs3.display();	
    }
}
