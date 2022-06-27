package com.belajar.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.belajar.unit.model.Produk;

public class TestObjectFactory {
	
	public static Produk createProduk() {
		  final Produk produk = new Produk();
		  produk.setId(new Random().nextLong());
		  produk.setNama(RandomStringUtils.randomAlphabetic(10));
		  produk.setHargaBeli(new Random().nextInt());
		  produk.setHargaJual(new Random().nextInt());

		  return produk;
	}

	public static List<Produk> createProductList(final int size){
		final List<Produk> result = new ArrayList<>();
		for(int i=0; i<size; i++) {
			result.add(createProduk());
		}
		return result;
	}
}
