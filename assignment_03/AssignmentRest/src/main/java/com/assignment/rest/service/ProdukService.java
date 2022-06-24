package com.assignment.rest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.rest.model.Produk;
import com.assignment.rest.repository.ProdukRepository;

//Service untuk menyediakan method-method terkait ProdukRepository yang dibutuhkan pada aplikasi ini
@Service
@Transactional
public class ProdukService {

	//Inisiasi ProdukRepository
	@Autowired
	private ProdukRepository produkRepository;

	//Menyimpan(menambah baru/mengubah) produk baru
	public void saveProduk(Produk produk) {
		produkRepository.save(produk);
	}

	//Mengambil semua produk yang tersimpan di database
	public List<Produk> getAllProduk() {
		return produkRepository.findAll();
	}

	//Mengambil satu produk berdasarkan id
	public Produk getProduk(Long id) {
		return produkRepository.findById(id).get();
	}

	//Menghapus satu produk berdasarkan id
	public void deleteProduk(Long id) {
		produkRepository.deleteById(id);
	}
}
