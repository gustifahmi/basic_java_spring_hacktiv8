package com.assignment.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.rest.model.Produk;

/*UserRepository yang mengextend JpaRepository, agar kita bisa menggunakan
method-method milik JPA pada objek produk
*/
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}
