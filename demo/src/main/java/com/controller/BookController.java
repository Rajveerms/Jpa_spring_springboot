package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dao.BookRepository;
import com.model.Book;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepo ;
	
	@PostMapping("/bookSave")
	public String insertBook(@RequestBody Book book)
	{
		bookRepo.save(book);
		return "Record Is Saved Successfully...! " ;
		
	}
	
	@PostMapping("/multipleBookSave")
	public String insertBook(@RequestBody List<Book> book)
	{
		bookRepo.saveAll(book);
		return "Multiple Record Is Saved Successfully...! " ;
		
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getBook()
	{
		return (List<Book>)bookRepo.findAll();
		
	}
	
	@GetMapping("/getBookName/{name}")
	public List<Book> getBook(@PathVariable("name") String bookName)
	{
		return (List<Book>)bookRepo.findBybookName(bookName);
		
	}
	
	@GetMapping("/getByBookId/{bookId}")
	public Optional<Book> getBook(@PathVariable("bookId") Long id)
	{
		return bookRepo.findById(id);
		
	}
	
}
