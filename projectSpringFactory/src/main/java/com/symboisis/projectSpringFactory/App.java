package com.symboisis.projectSpringFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext Context = new ClassPathXmlApplicationContext("Spring.xml");
    	A ob = (A)Context.getBean("a");
    	ob.msg();
    }
}
