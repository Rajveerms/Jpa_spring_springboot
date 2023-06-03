package com.autowiring;




public class Hardisk {

	private int id;
	private String hName;
	
	public Hardisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hardisk(int id, String hName) {
		super();
		this.id = id;
		this.hName = hName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	@Override
	public String toString() {
		return "Hardisk [id=" + id + ", hName=" + hName + "]";
	}
	
	
	
	
}
