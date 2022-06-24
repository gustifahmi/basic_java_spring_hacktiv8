package com.assignment.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produk")
public class Produk {

	//Kolom id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Kolom nama
	@Column(name = "nama", nullable = false)
	private String nama;

	//Kolom harga_beli
	@Column(name = "harga_beli", nullable = false)
	private int hargaBeli;
	
	//Kolom harga_jual
	@Column(name = "harga_jual", nullable = false)
	private int hargaJual;
	
	//Constructor kosong
	public Produk() {
	}
	
	//Constructor dengan nama, hargaBeli, dan hargaJual
	public Produk(String nama, int hargaBeli, int hargaJual) {
		this.nama = nama;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}

	//Setter id
	public void setId(Long id) {
		this.id = id;
	}
	
	//Setter nama
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	//Setter hargaBeli
	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	//Setter hargaJual
	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}

	//Getter id
	public Long getId() {
		return id;
	}

	//Getter nama
	public String getNama() {
		return nama;
	}

	//Getter hargaBeli
	public int getHargaBeli() {
		return hargaBeli;
	}

	//Getter hargaJual
	public int getHargaJual() {
		return hargaJual;
	}
	
	//Method toString, untuk memprint objek produk beserta attribute-attributenya
	public String toString() {
		return "Produk{" + "nama=" + nama + ", hargaBeli=" + hargaBeli + ", hargaJual=" + hargaJual + "}";
	}

}
