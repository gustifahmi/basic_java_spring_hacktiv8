package com.belajar.spring.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.MERGE)
	private List<Book> books;
	
	public BookCategory() {
	}
	
	public BookCategory(String name, Book... books) {
		this.name = name;
		this.books = Stream.of(books).collect(Collectors.toList());
		this.books.forEach(x -> x.setBookCategory(this));
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
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
	
	public String toString() {
		return "BookCategory{" + "id=" + id + ", name=" + name + ", books=" + books + "}";
	}
}
