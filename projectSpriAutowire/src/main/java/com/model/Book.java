package com.model;

public class Book {
	
	private String bName;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bName) {
		super();
		this.bName = bName;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "Book [bName=" + bName + "]";
	}
	
	
	
	

}
