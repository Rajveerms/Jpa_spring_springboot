package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcess()
	{
		return new Snapdragon();
	}

	@Bean
	public Address getAddress()
	{
		return new Address();
		
	}
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee(); 
	}
}
