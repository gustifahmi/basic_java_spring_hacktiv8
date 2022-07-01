Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Di sesi 19, saya mempelajari menggunakan swagger, sehingga kita bisa mengakses halaman swagger dari demo
kita yang akan menampilkan API apa saja yang ada di program kita. Lalu kita juga bisa langsung
mencoba API tersebut melalui swagger. Untuk bisa menampilkan swagger kita perlu 2 dependency, yaitu
springfox-swagger2 dan springfox-swagger-ui yang keduanya adalah dari io.springfox.

Di demo ini, saya menambahkan folder config yang di dalamnya terdapat file SwaggerConfig.java
Di dalam folder itulah kita mengonfigurasikan swagger. Pastikan di atas nama class, selain annotation
@Configuration (karena ini adalah sebuah file configuration), kita juga perlu menambahkan
annotation @EnableSwagger2 agar bisa menampilkan halaman swagger. Untuk mengakses halaman swagger
bisa kita lakukan dengan menjalankan program spring boot terlebih dahulu, setelah program berjalan
kita buka url http://localhost:8080/swagger-ui.html, maka akan menampilkan halaman swagger tersebut.