package com.model;

public class Author {
	
	private int aId;
	private String aName;
	
	private Book book;
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int aId, String aName, Book book) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.book = book;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [aId=" + aId + ", aName=" + aName + ", book=" + book + "]";
	}
	
}
