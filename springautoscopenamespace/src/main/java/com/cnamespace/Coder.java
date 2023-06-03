package com.cnamespace;

public class Coder {

	private int c_id;
	private String c_name;
	
	public Coder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coder(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "Coder [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	
	
	
}
