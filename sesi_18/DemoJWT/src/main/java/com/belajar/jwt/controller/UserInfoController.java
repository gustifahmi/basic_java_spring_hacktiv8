package com.belajar.jwt.controller;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.jwt.model.UserInfo;
import com.belajar.jwt.repository.UserInfoRepository;

@RestController
public class UserInfoController {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public UserInfoController(UserInfoRepository userInfoRepository) {
		this.userInfoRepository = userInfoRepository;
	}
	
	@PostMapping("/user")
	public Boolean create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException, ValidationException {
		String username = body.get("username");
		if(userInfoRepository.findByUsername(username) != null) {
			throw new ValidationException("Username already existed");
		}
		
		String password = body.get("password");
		String encodedPassword = new BCryptPasswordEncoder().encode(password);
		String fullname = body.get("fullname");
		userInfoRepository.save(new UserInfo(username, encodedPassword, fullname));
		return true;
	}

}
