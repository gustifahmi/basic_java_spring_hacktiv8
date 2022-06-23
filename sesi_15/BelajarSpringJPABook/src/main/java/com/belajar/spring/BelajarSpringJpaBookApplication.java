package com.belajar.spring;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.model.Book;
import com.belajar.spring.model.BookCategory;
import com.belajar.spring.model.Course;
import com.belajar.spring.model.Student;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

@SpringBootApplication
public class BelajarSpringJpaBookApplication implements CommandLineRunner {
	
	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringJpaBookApplication.class);
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookCategoryRepository bookCategoryRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringJpaBookApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		//Book 1
		Book book1 = new Book();
		book1.setTitle("Belajar Spring Boot");
		book1.setWriter("Teten Nugraha");
		book1.setIsbn("IS-90908");
		
		//Book 2
		Book book2 = new Book();
		book2.setTitle("Belajar Spring Boot 2");
		book2.setWriter("Teten Nugraha");
		book2.setIsbn("IS-9090890");
		
		//Insert book1 & book 2
		bookRepository.save(book1);
		bookRepository.save(book2);
		
		LOG.info("Berhasil menyimpan " + book1);
		LOG.info("Berhasil menyimpan " + book2);
		
		//Create Book Category Repository
		BookCategory bookCategory = bookCategoryRepository.save(new BookCategory("Programming", book1, book2));
		LOG.info("Book Category: " + bookCategory);
		
		//Create student
		Student student = new Student("Gusti Fahmi Fadhila", 23);
		studentRepository.save(student);
		
		//Create three courses
		Course course1 = new Course("Beginning Spring Boot", 12, 1500);
		Course course2 = new Course("Spring Reactive", 8, 800);
		Course course3 = new Course("Basic Microservices", 9, 100);
		courseRepository.saveAll(Arrays.asList(course1, course2, course3));
		
		//Add course to student
		student.getCourse().addAll(Arrays.asList(course1, course2, course3));
		studentRepository.save(student);
		
		//Retrieve all books
		List<Book> books = bookRepository.findAll();
		LOG.info("Books: " + books);
		
		//Retrieve all books written by Teten Nugraha
		books = bookRepository.findAllByWriter("Teten Nugraha");
		LOG.info("Books: " + books);
		
		//Retrieve book with ISBN IS-90908
		Book book = bookRepository.findByIsbn("IS-90908");
		LOG.info("Book: " + book);
		
		//Retrieve with query native
		books = bookRepository.findAllQueryNative();
		LOG.info("Books: " + books);

		books = bookRepository.findAllByWriterQueryNative("Teten Nugraha");
		LOG.info("Books: " + books);
	}

}
