package com.belajar.spring.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book_category")
public class BookCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "bookCategory", fetch = FetchType.LAZY, cascade = CascadeType.MERGE, targetEntity = Book.class)
	private List<Book> books;
	
	public BookCategory() {
	}
	
	public BookCategory(String name, Book... books) {
		this.name = name;
		List<Book> newBooks = Stream.of(books).collect(Collectors.toList());
		for(int i = 0; i < newBooks.size(); i++) {
			Book book = newBooks.get(i);
			addBook(book);
		}
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Book> getBooks() {
		return books;
	}
	
	public void addBook(Book book) {
		if(this.books == null) {
			this.books = new ArrayList<>(); 
		}
		book.setBookCategory(this);
		this.books.add(book);
	}
	
	public String toString() {
		return "BookCategory{" + "id=" + id + ", name=" + name + ", books=" + books + "}";
	}
}
