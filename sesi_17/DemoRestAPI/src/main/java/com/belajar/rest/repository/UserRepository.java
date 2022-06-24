package com.belajar.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.rest.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
