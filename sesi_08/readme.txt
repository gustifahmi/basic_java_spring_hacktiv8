Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Di sesi 08, saya belajar mengenai thread. Thread merupakan sebuah cara untuk menjalankan sebagian program
tidak secara berurutan, tetapi dijalankan secara concurrent (sebagian program dijalankan terpisah, tetapi
berjalan bareng dengan program main).

Di sesi 8 ini saya juga belajar untuk membuat sebuah project maven baru dengan cara menjalankan
perintah sebagai berikut:
mvn archetype:generate -DgroupId=com.learning.thread -DartifactId=DemoThread -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Selanjutnya akan ada folder DemoThread yang di dalamnya terdapat folder src, folder target, dan pom.xml
File App.java yang terdapat di folder src/main/java.com/learning/thread, selanjutnya jika kita ingin
menambahkan file java lainnya dapat diletakkan di folder tersebut. Sedangkan untuk file AppTest.java terdapat
pada folder src/test/java/com/learning/thread, selanjutnya jika kita ingin menambahkan test file dapat
diletakkan di folder tersebut.

Ketika kita membuat sebuah thread, misal 5 thread, dari thread 0 sampai thread 4, ada kemungkinan hasil
thread yang dibuat belakangan selesai lebih dulu daripada thread yang dibuat duluan, misal thread 4 selesai
lebih dulu dari thread 2. Cara agar kita mendapatkan hasil threaq sesuai urutan adalah dengan menggunakan
synchronize.