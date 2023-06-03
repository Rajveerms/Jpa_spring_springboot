package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	MobileProcessor CPU;
	public void configuration1()
	{
		System.out.println("ocat core, 4 gb ram, 12 mp cam, 64 gb storage");
		CPU.process();
	}
	

}
