package com.pnamespace;

public class Author {

	private int a_id;
	private String a_name;
	
	public Author() {
		super();
	}

	public Author(int a_id, String a_name) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	@Override
	public String toString() {
		return "Author [a_id=" + a_id + ", a_name=" + a_name + "]";
	}
	
	
	
}
