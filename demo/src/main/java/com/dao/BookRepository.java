package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	List<Book> findBybookName(String bookName);

}
