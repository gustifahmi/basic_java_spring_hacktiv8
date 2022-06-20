Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
1. RataRataMaxMin.java (Latihan 1)
   Program menerima input 3 bilangan dari user, yaitu bilangan pertama (x), bilangan kedua (y),
   dan bilangan ketiga (z). Lalu tiga bilangan tersebut akan dimasukkan ke dalam suatu array.
   Lalu program akan memanggil method hitungRataRata yang menjumlahkan x, y, dan z, kemudian
   dibagi 3. Sementara untuk mendapatkan bilangan terkecil dan terbesar dilakukan dengan sort
   array tersebut. Bilangan terkecil adalah index 0, sedangkan bilangan terbesar adalah index 2.

2. TempatDuduk.java (Latihan 2)
   Program menerima input 6 nama siswa di dalam kelas, yang nantinya akan mendapatkan tempat duduk
   seperti berikut:
   Siswa1          Siswa2          Siswa3
   Siswa4          Siswa5          Siswa6
   Lalu, nama siswa tersebut akan dimasukkan ke dalam array multidimensi seperti berikut:
   {{Siswa1, Siswa2, Siswa3}, {Siswa4, Siswa5, Siswa6}}
   Sehingga pola tempat duduk siswa dapat dibuat dengan melakukan for each 2 kali.

3. HitungDiskon.java (Latihan 3)
   Program menerima input dari user, yaitu jumlah pembelian, lalu akan memanggil method hitungPembayaran.
   Apabila jumlah pembelian >= 100000, maka akan print diskon sebesar 10% dan print total bayar
   setelah mendapatkan diskon. Namun jika jumlah pembelian < 100000, maka diskon yang diprint
   sebesar 0% dan total bayar yang diprint sama dengan jumlah pembelian karena tidak mendapatkan diskon. 

4. TahunKabisat.java (Latihan 4)
   Program akan menerima input dari user berupa tahun, lalu akan memanggil method cekKabisat.
   Pada method tersebut akan memeriksa apakah tahun tersebut merupakan tahun kabisat.
   Caranya adalah dengan mencari sisa bagi tahun tersebut dengan 4. Apabila hasil modulonya
   adalah 0 berarti tahun tersebut habis dibagi 4 yang berarti tahun kabisat. Namun jika
   hasil modulonya bukan 0 berarti bukan tahun kabisat.

5. PointOfSale.java (Latihan 5)
   Latihan ini sudah menerapkan OOP. Saya membuat sebuah class bernama Barang. Di dalam class Barang ini
   terdapat beberapa attributes/properties, yaitu:
   - nomor(int)
   - namaBarang(String)
   - harga(double)
   - diskon(double)
   Semua attribute tersebut bersifat private dan sudah saya sediakan setter dan getter, kecuali setter nomor.
   Karena asumsi saya, nomor barang seharusnya tidak berganti. Saya juga sediakan Constructor untuk membuat
   objek Barang baru dengan menerima 4 parameter, yaitu attribute-attribute dari Class Barang.
   
   Selanjutnya saya membuat 5 objek barang sesuai dengan yang ada di soal, termasuk semua attribute
   di dalamnya. Lalu saya membuat array daftarBarang untuk menyimpan 5 barang tersebut.

   Lalu user akan memasukkan input jumlah jenis barang yang dibeli. Lalu akan dilakukan for loop sebanyak
   jumlah jenis barang yang dibeli, yang masing masing for loop akan meminta input user untuk kode barang
   dan quantity. Saya juga menginisiasikan sebuah array multidimensi dengan length pertama sesuai dengan
   jumlah jenis barang yang dibeli dan length kedua adalah 2. Lalu saya masukkan masing-masing
   kode dan quantity ke array tersebut. Misal yang ada di contoh adalah membeli 4 barang, lalu memasukkan
   masing-masing kode dan quantity dari keempat barang tersebut, maka array multidimensi akan seperti ini:
   {{5,1}, {2,2}, {3,1}, {4,3}}. Array multidimensi ini digunakan untuk nanti memprint struk belanja.

   Lalu saya akan memprint struk belanja. Saya mempersiapkan dulu variabel total untuk menghitung 
   total belanja keseluruhan. Jadi, setiap for loop terhadap jenis barang yang dibeli, akan menerima
   input kode barang dan quantity. Dengan menggunakan kode barang, saya bisa mendapatkan nama barang,
   harga satuan barang, dan diskon. Kemudian quantity merupakan input dari user. Sedangkan sub total
   bisa dikalkulasikan dengan menghitung [harga - (harga * diskon)) * quantity], Lalu satu baris
   pada struk diperuntukkan untuk satu jenis barang. Kemudian saya menjumlahkan total dengan subtotal
   dari jenis barang tersebut. Hal ini akan berlanjut sampai looping berakhir.

   Setelah looping berakhir, artinya struk sudah tercetak semua. Dan semua subtotal telah dijumlahkan
   untuk mendapatkan total belanjaan seluruhnya. Setelah itu barulah program akan memprint total yang
   harus dibayarkan.
