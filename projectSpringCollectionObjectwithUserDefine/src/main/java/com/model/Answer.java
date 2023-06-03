package com.model;

public class Answer {

	private int ansId;
	private String ansDescription;
	
	public Answer() {
		super();
	}

	public Answer(int ansId, String ansDescription) {
		super();
		this.ansId = ansId;
		this.ansDescription = ansDescription;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnsDescription() {
		return ansDescription;
	}

	public void setAnsDescription(String ansDescription) {
		this.ansDescription = ansDescription;
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ansDescription=" + ansDescription + "]";
	}
	
	
	
}
