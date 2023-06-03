package com.model;

import java.util.*;

public class Question {

	private int qId;
	private String qName;
	
	
	List<Answer> ans;

	public Question() {
		super();
	}

	public Question(int qId, String qName, List<Answer> ans) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.ans = ans;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	
	public void display()
	{
		System.out.println("Question Id : "+qId);
		System.out.println("Question Name : "+qName);
				
		
		Iterator<Answer> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
}
