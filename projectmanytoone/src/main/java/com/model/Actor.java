package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Actor {

	@Id
	private int id;
	private String name;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + "]";
	}


	
	// many movies has one actor
	// one actor has many movies
}
