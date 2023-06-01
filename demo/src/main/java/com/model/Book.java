package com.model;

import javax.persistence.*;

@Entity
@Table( name = "table_book")
public class Book {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long bookId;
	private String bookName;
	private String bookAuthor;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(long bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	
	
	
	
}
