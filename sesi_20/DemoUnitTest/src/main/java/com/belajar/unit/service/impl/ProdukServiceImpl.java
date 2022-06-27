package com.belajar.unit.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.unit.model.Produk;
import com.belajar.unit.repository.ProdukRepository;
import com.belajar.unit.service.ProdukService;

//Service untuk menyediakan method-method terkait ProdukRepository yang dibutuhkan pada aplikasi ini
@Service
@Transactional
public class ProdukServiceImpl implements ProdukService {

	//Inisiasi ProdukRepository
	@Autowired
	private ProdukRepository produkRepository;

	//Menyimpan(menambah baru/mengubah) produk baru
	public Produk saveProduk(Produk produk) {
		produkRepository.save(produk);
		return produk;
	}

	//Mengambil semua produk yang tersimpan di database
	public List<Produk> getAllProduk() {
		return produkRepository.findAll();
	}

	//Mengambil satu produk berdasarkan id
	public Produk getProduk(Long id) {
		return produkRepository.findById(id).orElse(new Produk());
	}

	//Menghapus satu produk berdasarkan id
	public void deleteProduk(Long id) {
		produkRepository.deleteById(id);
	}
}
