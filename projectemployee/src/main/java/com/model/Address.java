package com.model;

public class Address {

	private int addid;
	private String addname;
	
	public Address() {
		super();
	}

	public Address(int addid, String addname) {
		super();
		this.addid = addid;
		this.addname = addname;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getAddname() {
		return addname;
	}

	public void setAddname(String addname) {
		this.addname = addname;
	}

	@Override
	public String toString() {
		return "Address [addid=" + addid + ", addname=" + addname + "]";
	}

	
}
