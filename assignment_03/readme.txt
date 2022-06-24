Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Pada assignment 3 ini, saya membuat sebuah proyek Spring Boot yang menyediakan REST API
yang bisa diakses di Postman. Saya membuat proyek Java dengan group id com.assignment.rest
dan ada beberapa dependency yang saya gunakan, yaitu:
1. Spring Boot Devtools
2. Spring Web
3. Spring Data JPA
4. MySQL Driver

Lalu saya juga menambahkan application.properties berikut ini:

application.properties
----------------------
#Port
server.port=8383

#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/db_produk?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root

#JPA Properties
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#Hibernate
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE

#JDBC
logging.level.org.springframework.jdbc.core.JdbcTemplate=DEBUG
logging.level.org.springframework.jdbc.core.StatementCreatorUtils=TRACE
-----------------------------------------------------------------------

Untuk portnya saya gunakan 8383, sehingga ketika menjalankan aplikasi ini,
yang diakses adalah http://localhost:8383/

Sedangkan untuk databasenya saya menggunakan db_produk dan database tersebut
sudah terlebih dahulu saya buat menggunakan DBeaver.

Di dalam package com.assignment.rest, saya membuat beberapa folder beserta
file Java di dalamnya, yaitu:
1. model -> Produk.Java
   Untuk membuat Entity Produk, sehingga di awal bisa menggenerate table
   produk beserta kolom-kolomnya dan agar bisa digunakan sebagai objek di
   package lain. Terdapat juga constructor yang dapat digunakan untuk membuat
   objek Produk dan setter-getter untuk mengubah atau mengambil attribute-attribute
   milik Produk karena bersifat private.
2. repository -> ProdukRespository.Java
   Sebuah interface yang meng-extend JpaRepository, sehingga bisa menggunakan
   method-method dari JpaRepository untuk mempermudah proses insert, select,
   update, dan delete ke database. Isi dari ProdukRepository memang dibuat kosong.
3. service -> ProdukService.Java
   Di service ini, kita akan menggunakan kita akan membuat method-method apa saja yang diperlukan
   dalam aplikasi ini. Selanjutnya di dalam method tersebut akan menggunakan objek dari
   ProdukRepository untuk menjalankan perintah ke database. Misal kita sudah menginisisi sebuah
   objek ProdukRepository dengan nama produkRepository. Misal kita membuat method
   createProduk(Produk produk), di dalam method tersebut akan menjalankan produkRepository.save(produk)
   untuk menyimpan produk dengan menggunakan method save milik JpaRepository. Selanjutnya service
   ini lah yang digunakan di controller, sehingga controller hanya bisa menggunakan method yang telah
   dibuat di service.
4. controller -> ProdukController.java
   Controller ini digunakan untuk langkah pertama dalam menangani request API. Di controller ini
   akan membaca endpoint dari request tersebut, kemudian request method-nya apa, sehingga tahu
   method mana yang digunakan. Lalu di dalam method itu juga bisa membaca query param dan request body
   jika memang ada. Selanjutnya di controller ini akan melanjutkan ke method di service yang sesuai
   dengan request yang diinginkan. Setelah selesai memanggil method dari service,
   maka di controller ini juga kita akan mengembalikan response API, baik itu ketika berhasil
   ataupun gagal, kita perlu mengembalikan response agar yang si consumer API kita tahu keberhasilan
   ataupun kegagalan dari request tersebut.