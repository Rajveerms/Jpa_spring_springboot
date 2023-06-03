package com.collection.userdefine;

import java.util.*;

public class Question {
	
	private int qid;
	private String qname;
	
	 List<Answer> answer;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qid, String qname, List<Answer> answer) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answer = answer;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public void display()
	{
			
			System.out.println(qid+" : "+qname);
			
			Iterator<Answer>	iterator = 	answer.iterator();
			
			while(iterator.hasNext())
			{
				Answer ans = iterator.next();
				
				System.err.println(ans.getAid() + ans.getAns());
			}
			
	}

}
