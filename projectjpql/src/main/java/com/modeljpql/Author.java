package com.modeljpql;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find name", query = "select a.name from Author a")
@NamedQuery(name = "find count", query = "select count(a) from Author a")

public class Author 
{
	@Id
	private int id;
	private String name;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name) {
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
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
