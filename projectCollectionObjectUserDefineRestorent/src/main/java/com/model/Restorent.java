package com.model;

import java.util.*;

public class Restorent 
{
	private int resId;
	private String resName;
	
	List<Menu> menu;

	public Restorent() {
		super();
	}

	public Restorent(int resId, String resName, List<Menu> menu) {
		super();
		this.resId = resId;
		this.resName = resName;
		this.menu = menu;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}
	
	public void display()
	{
		System.out.println("Restorent Id : "+resId);
		System.out.println("Restorent Name : "+resName );
		
		Iterator<Menu> iterator = menu.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
