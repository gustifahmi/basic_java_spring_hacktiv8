package com.belajar.bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.bootstrap.model.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
	Mahasiswa getById(String id);
}