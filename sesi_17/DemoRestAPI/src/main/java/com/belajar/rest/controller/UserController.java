package com.belajar.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.rest.model.User;
import com.belajar.rest.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;

	@CrossOrigin
	@PostMapping("/users")
	public ResponseEntity<?> users(@RequestBody User user) {
		if(user.getFirstName() != null && user.getLastName() != null &&
		!user.getFirstName().equals("") && !user.getLastName().equals("")) {
			if(user.getId() != 0 && userService.getUser(user.getId()) != null) {
				return new ResponseEntity<>("Id sudah tersimpan, silahkan gunakan id lain atau jangan menggunakan id", HttpStatus.BAD_REQUEST);
			}
			userService.saveUser(user);
			return new ResponseEntity<>("User berhasil ditambahkan", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Pastikan field firstName dan lastName tidak kosong", HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin
	@GetMapping("/users")
	public ResponseEntity<?> list() {
		if(userService.listAllUser().size() != 0) {
			return new ResponseEntity<List<User>>(userService.listAllUser(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Tidak ada Produk yang tersimpan", HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@GetMapping("/users/{id}")
	public ResponseEntity<?> users(@PathVariable Integer id) {
		try {
			User user = userService.getUser(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("User dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PutMapping("/users/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
		try {
			User existUser = userService.getUser(id);
			if (existUser.getId() != id) {
				return new ResponseEntity<>("User dengan id=" + id + " tidak ditemukan", HttpStatus.OK);
			}
			user.setId(id);
			userService.saveUser(user);
			return new ResponseEntity<>("User dengan id=" + id + " berhasil diubah", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("User dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		try {
			userService.deleteUser(id);
			return new ResponseEntity<>("User dengan id=" + id + " berhasil dihapus", HttpStatus.OK);
		} catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<>("User dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}
}