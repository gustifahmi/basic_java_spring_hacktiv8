Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Pada assignment 3 ini, saya membuat sebuah proyek Spring Boot yang menyediakan REST API
yang bisa diakses di Postman. Saya membuat proyek Java dengan group id com.belajar.rest
dan ada beberapa dependency yang saya gunakan, yaitu:
1. Spring Boot Devtools
2. Spring Web
3. Spring Data JPA
4. MySQL Driver

Lalu saya juga menambahkan application.properties berikut ini:

application.properties
----------------------
#Port
server.port=8181

#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/db_rest?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
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

Untuk portnya saya gunakan 8181, sehingga ketika menjalankan aplikasi ini,
yang diakses adalah http://localhost:8181/

Sedangkan untuk databasenya saya menggunakan db_rest dan database tersebut
sudah terlebih dahulu saya buat menggunakan DBeaver.

Di dalam package com.belajar.rest, saya membuat beberapa folder beserta
file Java di dalamnya, yaitu:
1. model -> User.Java
   Untuk membuat Entity User, sehingga di awal bisa menggenerate table
   user beserta kolom-kolomnya dan agar bisa digunakan sebagai objek di
   package lain. Terdapat juga constructor yang dapat digunakan untuk membuat
   objek User dan setter-getter untuk mengubah atau mengambil attribute-attribute
   milik User karena bersifat private.
2. repository -> UserRespository.Java
   Sebuah interface yang meng-extend JpaRepository, sehingga bisa menggunakan
   method-method dari JpaRepository untuk mempermudah proses insert, select,
   update, dan delete ke database. Isi dari UserRepository memang dibuat kosong.
3. service -> UserService.Java
   Di service ini, kita akan menggunakan kita akan membuat method-method apa saja yang diperlukan
   dalam aplikasi ini. Selanjutnya di dalam method tersebut akan menggunakan objek dari
   UserRepository untuk menjalankan perintah ke database. Misal kita sudah menginisisi sebuah
   objek UserRepository dengan nama userRepository. Misal kita membuat method
   createUser(User user), di dalam method tersebut akan menjalankan userRepository.save(user)
   untuk menyimpan user dengan menggunakan method save milik JpaRepository. Selanjutnya service
   ini lah yang digunakan di controller, sehingga controller hanya bisa menggunakan method yang telah
   dibuat di service.
4. controller -> UserController.java
   Controller ini digunakan untuk langkah pertama dalam menangani request API. Di controller ini
   akan membaca endpoint dari request tersebut, kemudian request method-nya apa, sehingga tahu
   method mana yang digunakan. Lalu di dalam method itu juga bisa membaca query param dan request body
   jika memang ada. Selanjutnya di controller ini akan melanjutkan ke method di service yang sesuai
   dengan request yang diinginkan. Setelah selesai memanggil method dari service,
   maka di controller ini juga kita akan mengembalikan response API, baik itu ketika berhasil
   ataupun gagal, kita perlu mengembalikan response agar yang si consumer API kita tahu keberhasilan
   ataupun kegagalan dari request tersebut.