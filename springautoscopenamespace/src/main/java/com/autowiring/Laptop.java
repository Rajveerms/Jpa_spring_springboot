package com.autowiring;



public class Laptop {

	
	private int lId;
	private String lName;
	
	
	private Hardisk hardisk ;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lId, String lName, Hardisk hardisk) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.hardisk = hardisk;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Hardisk getHardisk() {
		return hardisk;
	}

	public void setHardisk(Hardisk hardisk) {
		this.hardisk = hardisk;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + ", hardisk=" + hardisk + "]";
	}

	

	
	
	 
	
	
}
