Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Di sesi 14 ini, yang pertama saya belajar mengenai penggunaan servlet. Untuk proyeknya,
saya membuatnya menggunakan aplikasi Eclipse IDE for Enterprise Java and Web Developer.
Selanjutnya, saya membuat project baru dengan File -> New -> Other -> Dynamic Web Project.
Selanjutnya terdapat folder utama yang saya namakan belajarServlet, yang digunakan
untuk menyimpan folder src. Selanjutnya di dalam folder src/main terdapat 2 folder, yaitu
java/com/belajar dan webapp. Folder java/com/belajar akan digunakan untuk file-file java,
sedangkan folder webapp untuk menyimpan file jsp dan xml.

Di dalam folder src/main/java/com/belajar terdapat 2 folder berserta file java
di dalamnya, yaitu:
1. model
   - Member.java
     Model Member beserta attribute username dan password, serta constructor, setter,
     dan getter, agar nantinya bisa dibuat objek member.   
2. web
   - HelloServlet.java
     Untuk method doGet (tidak lagi digunakan karena yang digunakan sekarang adalah untuk
     login) 
   - LoginController.java
     Untuk method doPost untuk menghandle login dari user.

Lalu di folder webapp, terdapat 3 file yang saya tambahkan, yaitu:
1. index.jsp
   jsp (Jakarta Server Pages) yang merupakan dokumen untuk java yang secara dinamis bisa meng-generate
   sebuah halaman web. Di dalam jsp kita juga perlu tambahkan script html (juga script css bila perlu)
   untuk halaman web-nya. Di index ini digunakan untuk menampilkan halaman default saat aplikasi dijalankan.
   Di halaman ini akan berisi form login yang meminta input username dan password dari user
2. member.jsp
   Untuk halaman setelah login.
3. web.xml di dalam folder WEB-INF
   Untuk konfigurasi welcome-file (halaman default, yaitu index.jsp) dan servlet yang digunakan.

Untuk menjalankan program ini, pertama kita perlu menjalankan server terlebih dahulu.
Caranya adalah File -> New -> Other -> Server -> Apache -> Tomcat v10.0 Server.
Pastikan kita sudah mendownload Apache Tomcat v10.0 terlebih dahulu. Lalu setelah
server berhasil berjalan, kita bisa jalankan aplikasi dengan klik kanan pada folder
belajarServlet -> Run As -> Run On Server -> pilih server yang tadi sudah berjalan -> Next -> Finish.
Selanjutnya akan masuk ke halaman login yang diambil dari index.jsp, lalu masukkan username
dan password, lalu akan masuk halaman dari member.jsp