package com.assignment.rest.controller;

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

import com.assignment.rest.model.Produk;
import com.assignment.rest.service.ProdukService;

//Controller, untuk menindaklanjuti request api
@RestController
@RequestMapping("/api/v1")
public class ProdukController {
	
	//Inisiasi ProdukService
	@Autowired
	ProdukService produkService;

	//Menambah produk baru
	@CrossOrigin
	@PostMapping("/produk")
	public ResponseEntity<?> createProduk(@RequestBody Produk produk) {
		//Memastikan semua field terisi
		if(produk.getNama() != null && produk.getHargaBeli() != 0 && produk.getHargaBeli() != 0 &&
		!produk.getNama().equals("")) {
			//Memeriksa apakah id yang diinput user sudah tersimpan di database, jika iya maka mengembalikan bad request
			if(produk.getId() != null && produkService.getProduk(produk.getId()) != null) {
				return new ResponseEntity<>("Id sudah tersimpan, silahkan gunakan id lain atau jangan menggunakan id", HttpStatus.BAD_REQUEST);
			}
			produkService.saveProduk(produk);
			return new ResponseEntity<>("Produk berhasil ditambahkan", HttpStatus.OK);
		} else {
			//Jika ada field yang tidak terisi, maka mengembalikan code 400 Bad Request
			return new ResponseEntity<>("Pastikan semua field terisi", HttpStatus.BAD_REQUEST);
		}
	}

	//Mengambil semua produk yang tersimpan
	@CrossOrigin
	@GetMapping("/produk")
	public ResponseEntity<?> allProduk() {
		//Memeriksa apakah ada produk yang tersimpan
		if(produkService.getAllProduk().size() != 0) {
			return new ResponseEntity<List<Produk>>(produkService.getAllProduk(), HttpStatus.OK);
		} else {
			//Jika tidak ada produk tersimpan, maka response statusnya not found
			return new ResponseEntity<>("Tidak ada Produk yang tersimpan", HttpStatus.NOT_FOUND);
		}
	}

	//Mengambil satu produk berdasarkan id
	@CrossOrigin
	@GetMapping("/produk/{id}")
	public ResponseEntity<?> getProdukById(@PathVariable Long id) {
		try {
			Produk produk = produkService.getProduk(id);
			return new ResponseEntity<Produk>(produk, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			//Jika tidak ada produk dengan id tersebut
			return new ResponseEntity<>("Produk dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}

	//Mengubah salah satu produk berdasarkan id
	@CrossOrigin
	@PutMapping("/produk/{id}")
	public ResponseEntity<?> update(@RequestBody Produk produk, @PathVariable Long id) {
		try {
			Produk produkLama = produkService.getProduk(id);
			if(produkLama.getId() != id) {
				return new ResponseEntity<>("Produk dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
			}
			produk.setId(id);
			produkService.saveProduk(produk);
			return new ResponseEntity<>("Produk dengan id=" + id + " berhasil diubah", HttpStatus.OK);
		} catch(NoSuchElementException e) {
			//Jika tidak ada produk dengan id tersebut
			return new ResponseEntity<>("Produk dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}

	//Menghapus satu produk berdasarkan id
	@CrossOrigin
	@DeleteMapping("/produk/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		//Memeriksa apakah produk dengan id tersebut ada
		try {
			produkService.deleteProduk(id);
			return new ResponseEntity<>("Produk dengan id=" + id + " berhasil dihapus", HttpStatus.OK);
		} catch (EmptyResultDataAccessException e) {
			//Jika produk dengan id tersebut tidak ada, kembalikan not found
			return new ResponseEntity<>("Produk dengan id=" + id + " tidak ditemukan", HttpStatus.NOT_FOUND);
		}
	}
}