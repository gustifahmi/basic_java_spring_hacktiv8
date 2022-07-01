Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Di sesi 20 ini, saya belajar menegenai Unit Test. Unit test adalah program test yang dibuat agar
ketika kita mengerjakan/mengubah program kita, kita bisa tahu apakah program tersebut sudah berjalan
dengan benar atau belum. Unit test merupakan test terkecil yang tingkatannya adalah untuk mengetes
masing-masing unit atau dalam hal ini bisa untuk mengetes masing-masing method.

Beberapa dependency yang dibutuhkan untuk Unit Test antara lain:
- junit-jupiter-engine dari org.junit.jupiter
- junit-jupiter-params dari org.junit.jupiter
- junit-platform-launcher dari org.junit.platform
- junit-vintage-engine dari org.junit.vintage
- mockito-junit-jupiter dari org.mockito
- commons-lang3 dari org.apache.commons
- problem-spring-web-starter dari org.zalando

Ketika kita membuat unit test, kita perlu membuat mock data atau dengan kata lain kita generate
data secara random (tapi tetap valid) yang hanya digunakan untuk keperluan unit test. Untuk method
generate product terdapat di file TestObjectFactory.java di folder src/test/java, di package
com.belajar.unit, sedangkan untuk file testnya bernama ProdukServiceTest.java berada di folder yang sama.

Di file ProdukServiceTest terdapat beberapa annotation serta method yang kita import serta kita gunakan,
antara lain:
- @RunWith(SpringRunner.class)
  Terletak di atas class, menandakan class ini dijalankan dengan SpringRunner
- @Mock
  Membuat mock suatu object (dalam demo ini adalah produkRepository) sehingga yang digunakan adalah
  mock repository ini, bukan repository yang asli.
- @InjectMock
  Meng-inject mock yang sudah dibuat (produkRepository) ke dalam suatu objek (dalam demo ini adalah objek
  produkServiceImpl), sehingga ketika di dalam test perlu memanggil produkServiceImpl
  dan didalam produkServiceImpl menggunakan produkRepository, maka repository yang dipanggil adalah
  yang mock, bukan yang asli 
- @Before
  Menandakan bahwa method tersebut yang dijalankan pertama saat menjalankan tes tersebut 
- @Test
  Menandakan method tersebut adalah method untuk test

Di sini ada 5 test method, yaitu:
- testGetAll
- testProdukById
- testProductIdWithNullDataFromDB
- testSaveUpdateProduct
- testDeleteProduct

Untuk menjalankan test bisa dilakukan dengan cara:
Pada package explorer, cari nama project tersebut, lalu klik kanan -> Run As -> Junit Test

Lalu akan muncul tab JUnit di bawah (sebaris dengan console, terminal, dll). Hasilnya akan tampil
di situ. Terdapat 2 file yang ditest, yaitu DemoUnitTestApplicationTests dan ProdukServiceTest.
Pastikan kedua file test tersebut passed yang menandakan unit test-nya berhasil.