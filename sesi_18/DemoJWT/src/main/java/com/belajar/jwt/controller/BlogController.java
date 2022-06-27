package com.belajar.jwt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.jwt.model.Blog;
import com.belajar.jwt.repository.BlogRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class BlogController {

	@Autowired
	private BlogRepository blogRepository;
	
	public BlogController(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}
	
	@GetMapping("/blog")
	public List<Blog> index() {
		return blogRepository.findAll();
	}
	
	@GetMapping("/blog/{id}")
	public Blog show(@PathVariable String id) {
		Long blogId = Long.parseLong(id);
		return blogRepository.findById(blogId).orElse(new Blog());
	}
	
	@PostMapping("/blog/search")
	public List<Blog> search(@RequestBody Map<String, String> body) {
		String searchTerm = body.get("text");
		return blogRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
	}
	
	@PostMapping("/blog")
	public Blog create(@RequestBody Map<String, String> body) {
		String title = body.get("title");
		String content = body.get("content");
		String author = body.get("author");
		return blogRepository.save(new Blog(title, content, author));
	}
	
	@PutMapping("/blog/{id}")
	public Blog update(@PathVariable String id, @RequestBody Map<String, String> body) {
		Long blogId = Long.parseLong(id);
		
		Blog blog = blogRepository.findById(blogId).orElse(new Blog());
		blog.setTitle(body.get("title"));
		blog.setContent(body.get("content"));
		blog.setAuthor(body.get("author"));
		return blogRepository.save(blog);
	}
	
	@DeleteMapping("/blog/{id}")
	public boolean delete(@PathVariable String id) {
		Long blogId = Long.parseLong(id);
		blogRepository.deleteById(blogId);
		return true;
	}
}
