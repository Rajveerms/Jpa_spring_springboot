package com.symboisis.projectSpringAnnotationBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.AppConfiguration;
import com.model.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	//Samsung s = (Samsung)context.getBean(Samsung.class);
    	//s.configuration1();
    	
    	Employee e = context.getBean(Employee.class);
    	e.display();
    	
    }
}
