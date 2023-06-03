package collection;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int q_id;
	private String q_name;
	
	
	List <String> answer;


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question(int q_id, String q_name, List<String> answer) {
		super();
		this.q_id = q_id;
		this.q_name = q_name;
		this.answer = answer;
	}


	public int getQ_id() {
		return q_id;
	}


	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}


	public String getQ_name() {
		return q_name;
	}


	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}


	public List<String> getAnswer() {
		return answer;
	}


	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}


		public void display()
		{
			
			System.out.println("Question ID : "+q_id + "\n"+"Question Name : "+q_name);
			
			Iterator<String> iterator = answer.iterator();
				
			System.out.println("\n ANSWER IS : \n");
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	

}
