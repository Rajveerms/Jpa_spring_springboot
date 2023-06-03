package com.factorymethod;

public class A {

	private static final A obj = new A() ;
	
	private A()	//only in singleton we can create constructor private 
	{
		System.out.println("Private Constructor");
	}
	
	public static A getA()
	{
		return obj;
		
	}
	
	public void msg()
	{
		System.out.println("Hello Ram ...! ");
	}
}
