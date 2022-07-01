Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Object Relationship Mapping (ORM) adalah jembatan antara project Spring dengan Relational
Database. Penggunaan ORM memudahkan programmer karena kita bisa menggunakan Relational
Database dengan package-package yang bisa digunakan di Java dengan lebih simple. kita
bisa memetakan table atau query ke dalam class Java dengan Plain Old Java Object (POJO),
yaitu class Java yang berisi hanya private variabel dan method setter getter, tanpa
method lainnya.

Lalu, selanjutnya ada Data Access Object (DAO), yaitu class Java yang berisi operasi
CRUD.

Selanjutnya, saya belajar mengenai Hibernate. Hibernate merupakan sebuah framework
Java yang memungkinkan untuk melakukan koneksi ke database relasional, termasuk
yang digunakan pada demo sesi 13 ini, yaitu MySQL.

Lalu berikutnya, saya membuat project Maven baru melalui Eclipse. Selanjutnya saya Menambahkan
dependency yang diperlukan antara lain:
1. hibernate
2. hibernate-annotations
3. mysql-connector-java
4. jta
Saya juga menambahkan plugin, yaitu
1. maven-compiler-plugin

Selanjutnya, saya membuat database mysql baru yang saya namakan db_hibernate, lalu saya juga membuat
table bernama address_book dengan 3 column, yaitu:
1) id int PRIMARY KEY NOT NULL AUTO_INCREMENT
2) nama VARCHAR(255) NOT NULL
3) address VARCHAR(255) NOT NULL
Saya menambahkan database dan table melalui DBeaver.

Selanjutnya saya menambahkan hibernate.cfg.xml di folder src/main/resources mengikuti yang ada
di kode.id. Namun ada beberapa perubahan yang saya lakukan, yaitu:
1) Untuk property connection.uri saya mengubah menjadi:
   jdbc:mysql://localhost:3306/db_hibernate?allowPublicKeyRetrieval=true&amp;useSSL=false&amp;useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC
   Alasan saya mengubah connection.uri yang pertama yang saya ubah adalah nama database-nya. Saya
   menamakan database saya db_hibernate, berbeda dengan yang di contoh. Namun, ternyata masih ada
   error yaitu Communication link failure. Karena saya pikir errornya adalah saat mencoba konek
   ke database, sehingga saya coba ganti dengan uri yang dicontohkan Mas Arif saat demo swagger.
   Ternyata setelah mengubahnya, program berhasil dijalankan.
2) Menambahkan property connection.password menjadi root karena mysql saya ada password-nya
   yaitu root
3) Mengubah mapping resource menjadi demo_hibernate/AddressBook.hbm.xml, perubahannya adalah
   pada nama package, saya menyimpan AddressBook.hbm.xml di dalam package yang saya
   namakan demo_hibernate

Selanjutnya saya membuat file AddressBook.java seperti yang ada di kode.id. Tidak banyak perbedaan
pada file AddressBook.java yang saya buat hanya nama package-nya yang saya ubah sesuai dengan
nama package saya, yaitu saya ubah menjadi demo_hibernate.

Lalu, selanjutnya saya menambahkan file AddressBook.hbm.xml di dalam package demo_hibernate. Isinya
tidak jauh berbeda dengan yang dicontohkan di kode.id, hanya pada property class saja,
jika di contoh <class name="testhibernate1.AddressBook">, maka di AddressBook.hbm.xml di projek
saya, saya mengubah menjadi <class name="demo_hibernate.AddressBook">

Selanjutnya di dalam package demo_hibernate saya membuat file App.java seperti yang dicontohkan
di kode.id. Sama seperti di AddressBook.java, di App.java pun saya hanya mengubah nama package
menjadi demo_hibernate.

Selanjutnya saya coba menjalankan App.java. Caranya adalah dengan klik kanan pada file App.java,
lalu klik Run As > Java Application. Program saya berhasil dijalankan dan outputnya adalah
seperti berikut:

Hibernate: 
    select
        max(id) 
    from
        address_book
Hibernate: 
    insert 
    into
        address_book
        (name, address, id) 
    values
        (?, ?, ?)
