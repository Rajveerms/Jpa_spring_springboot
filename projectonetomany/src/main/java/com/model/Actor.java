package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Actor {

	@Id
	private int id;
	private String name;

	@OneToMany
	List<Movie> movies;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Actor(int id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
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

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", movies=" + movies + "]";
	}

	// many movies has one actor
	// one actor has many movies
}
