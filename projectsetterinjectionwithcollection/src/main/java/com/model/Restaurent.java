package com.model;

import java.util.*;


public class Restaurent {
	
	private int rId;
	private String rName;
	
	List<String> menu ;

	public Restaurent() {
		super();
	}

	public Restaurent(int rId, String rName, List<String> menu) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.menu = menu;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
	public void display()
	{
		System.out.println("Resturent Id : "+rId);
		System.out.println("Resturent Name : "+rName);
		
		System.out.println("  * Menu *   ");
		Iterator<String> it = menu.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		
	}

}
