package com.belajar.bootstrap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;
	
	@Column(unique = true, nullable = false)
	private String nim;

	@Column(nullable = false)
	private String nama;
	
	@Column(nullable = false)
	private String jurusan;

	private float ipk;
	
	public Mahasiswa() {
	}
	
	public Mahasiswa(String nim, String nama, String jurusan, float ipk) {
		this.nim = nim;
		this.nama = nama;
		this.jurusan = jurusan;
		this.ipk = ipk;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	public void setIpk(float ipk) {
		this.ipk = ipk;
	}

	public String getId() {
		return id;
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

	public String getJurusan() {
		return jurusan;
	}

	public float getIpk() {
		return ipk;
	}
	
	public String toString() {
		return "Mahasiswa{" + "id=" + id + ", nim=" + nim + ", nama=" + nama +
				", jurusan=" + jurusan + ", ipk=" + ipk +  "}";
	}
}
