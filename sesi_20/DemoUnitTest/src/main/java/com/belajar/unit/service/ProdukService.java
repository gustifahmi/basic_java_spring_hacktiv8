package com.belajar.unit.service;

import java.util.List;

import com.belajar.unit.model.Produk;

public interface ProdukService {
	Produk saveProduk(Produk produk);
	List<Produk> getAllProduk();
	Produk getProduk(Long id);
	void deleteProduk(Long id);
}
