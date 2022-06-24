package com.belajar.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.jwt.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
	UserInfo findByUsername(String username);
}
