package com.symboisis.projectSpriAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Author;
import com.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext Context = new ClassPathXmlApplicationContext("Spring1.xml");
    	
//    	Author a = (Author)Context.getBean("at");
//        System.out.println(a);
    	
    	Employee e = (Employee)Context.getBean("em");
    	System.out.println(e);
    }
}
