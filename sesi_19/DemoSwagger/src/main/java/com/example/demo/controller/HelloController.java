package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/hactive8")
	public String sayHello() {
		return "Swagger Hello World";
	}
}