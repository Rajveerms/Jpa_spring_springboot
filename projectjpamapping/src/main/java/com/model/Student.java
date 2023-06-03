package com.model;

import javax.persistence.*;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int marks;
	
	//@OneToOne(cascade = CascadeType.PERSIST)
	//mappedBy its changes structure -> we can see the linking of tables from both the tables so it will maintain the structure as we want 
	// it will display one to many as student primary key in course table bcoz "student" its a referenced in course  
	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "student")
	private Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int marks, Course course) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}	
	
	
}
