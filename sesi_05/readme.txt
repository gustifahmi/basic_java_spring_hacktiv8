Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Terdapat 4 pilar utama Object-oriented programming (OOP), yaitu:

1. Abstraction
   Kita bisa membuat sebuah class menjadi sebuah abstract class yang memuat sedikitnya
   satu abstract method. Abstract method adalah sebuah method dengan nama dan parameter (jika ada),
   tetapi tanpa body. Untuk semua class yang merupakan sub class dari abstract class harus mendefinisikan
   sendiri method tersebut. Misal di class MakhlukHidup terdapat abstract bernafas(), maka semua
   sub class harus memiliki method bernafas masing-masing.

2. Inheritance
   Inheritance adalah pewarisan. Jika terdapat sebuah class sebagai parent class. Maka setiap sub class
   yang mengextend parent class tersebut akan otomatis mewariskan semua attribute dan juga method yang
   dimiliki oleh parent class, tanpa perlu dibuat lagi di sub class tersebut.

3. Encapsulation
   Encapsulation adalah proses membungkus attribute attribute dalam suatu class dengan membuat
   attribute tersebut menjadi private, sehingga attribute tersebut hanya bisa diakses oleh
   class tersebut. Namun, class tersebut juga dapat menyediakan method setter dan method getter.
   Setter digunakan untuk mengubah private attribute tersebut. Sedangkan getter digunakan untuk
   mendapatkan value dari private attribute tersebut. 

4. Polymorphism
   Polymorphism artinya adalah memiliki beragam bentuk. Dalam hal ini (OOP), Polymorphism
   adalah method yang bisa memiliki nama yang sama tetapi berbeda isinya. Dalam hal ini terdapat
   2 jenis polymorphism, yaitu overriding dan overloading.
   1) Overriding adalah ketika sebuah parent class dan sebuah class memiliki sebuah method
      yang namanya sama, tetapi isinya berbeda. Misal class Hewan dan class Burung memiliki
      method yang bernama bergerak() yang isinya beda, maka untuk objek burung yang akan
      terpakai adalah bergerak() miliknya sendiri karena meng-override method bergerak()
      milik class Hewan, sedangkan method bergerak() milik Hewan akan terpakai oleh objek hewan
      atau objek dari sub class-nya selama tidak ada override.
   2) Overloading adalah ketika ada method yang namanya sama, tetapi parameternya berbeda, baik
      itu di dalam class yang sama, ataupun antara parent class dan sub class. Misal ada dua method,
      menyerang() dan menyerang(String senjata), maka ketika akan memanggil method menyerang
      akan melihat parameternya terlebih dahulu. Ketika tanpa parameter, yang dipanggil adalah
      menyerang(), sedangkan jika ada 1 parameter bertipe string, maka yang dipanggil adalah
      menyerang(String senjata). Overloading juga berlaku untuk yang jumlah parameternya sama,
      tetapi tipe parameternya berbeda.