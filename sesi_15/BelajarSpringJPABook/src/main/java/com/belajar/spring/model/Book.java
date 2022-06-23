package com.belajar.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "writer", nullable = false)
	private String writer;
	
	@Column(name = "isbn", nullable = false)
	private String isbn;
	
	@ManyToOne
	@JoinColumn
	private BookCategory bookCategory;

	public Book() {
	}
	
	public Book(String title, String writer, String isbn) {
		this.title = title;
		this.writer = writer;
		this.isbn = isbn;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getIsbn() {
		return isbn;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public String toString() {
		return "Book{" + "id=" + id + ", title=" + title +
				", writer=" + writer + ", isbn=" + isbn + "}";
	}
}
