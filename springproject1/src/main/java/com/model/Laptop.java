package com.model;

public class Laptop {

	private int lapId;
	private String lapName;
	
	private Hardisk hardisk;
	
	
	// Contructors 
	
	public Laptop() {
		super();
	}

	public Laptop(int lapId, String lapName, Hardisk hardisk) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
		this.hardisk = hardisk;
	}

	// Getter Setter Method 
	
	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public Hardisk getHardisk() {
		return hardisk;
	}

	public void setHardisk(Hardisk hardisk) {
		this.hardisk = hardisk;
	}

	//TO String 

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + ", hardisk=" + hardisk + "]";
	}


}
