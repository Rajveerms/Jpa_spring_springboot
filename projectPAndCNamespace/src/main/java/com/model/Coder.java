package com.model;

public class Coder {

	private int id;
	private String name;
	private String qualification;
	private String dob;
	
	public Coder() {
		super();
	}

	public Coder(int id, String name, String qualification, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Coder [id=" + id + ", name=" + name + ", qualification=" + qualification + ", dob=" + dob + "]";
	}

	
	
	
	
}
