package com.model;

import javax.persistence.*;

@Entity
public class Movie {
	
	@Id
	private int movieId;
	private String movieName;
	
	
	@ManyToOne
	private Actor actor;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Movie(int movieId, String movieName, Actor actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public Actor getActor() {
		return actor;
	}


	public void setActor(Actor actor) {
		this.actor = actor;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}

}
