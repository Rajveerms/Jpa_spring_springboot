package com.model;

public class Author {

	private int id;
	private String name;
	private String qualification;
	private String dob;
	
	public Author() {
		super();
	}

	public Author(int id, String name, String qualification, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", qualification=" + qualification + ", dob=" + dob + "]";
	}
	
	
	
}
