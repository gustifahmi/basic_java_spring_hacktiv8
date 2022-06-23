package com.belajar.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.belajar.spring.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	//Retrieve List of books
	List<Book> findAll();
	List<Book> findAllByWriter(String writer);
	
	//Retrieve one book
	Book findByTitle(String title);
	Book findByIsbn(String isbn);
	
	//Query Native
	@Query(nativeQuery = true, value = "SELECT * FROM book")
	List<Book> findAllQueryNative();
	
	@Query(nativeQuery = true, value = "SELECT * FROM book WHERE writer = ?1")
	List<Book> findAllByWriterQueryNative(String writer);
}
