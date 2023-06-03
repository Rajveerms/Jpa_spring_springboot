package com.model;

import javax.persistence.*;

@Entity
public class Course 
{
	@Id
	private int courseid;
	private String coursename;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Student student;
	
	public Course() {
		super();
	}

	public Course(int courseid, String coursename, Student student) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.student = student;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", student=" + student + "]";
	}
	
	
}
