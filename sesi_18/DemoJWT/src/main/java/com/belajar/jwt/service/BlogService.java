package com.belajar.jwt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.belajar.jwt.model.Blog;
import com.belajar.jwt.repository.BlogRepository;

@Service
public class BlogService {

    public BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
    	this.blogRepository = blogRepository;
    }

    @Transactional
    public List<Blog> getAllBlogs(final int count){
        return this.blogRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional
    public Optional<Blog> getBlog(Long id) {
    	return this.blogRepository.findById(id);
    }
}