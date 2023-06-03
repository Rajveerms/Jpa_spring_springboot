package com.model;

public class Menu 
{
	private int menuId;
	private String menuName;
	
	public Menu() {
		super();
	}

	public Menu(int menuId, String menuName) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + "]";
	}

	
	
}
