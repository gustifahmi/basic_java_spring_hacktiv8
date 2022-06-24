Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Di sesi ini, saya belajar untuk menambahkan file html, script css dan bootstrap
agar bisa menampilkan halaman untuk CRUD, sehingga CRUD-nya akan kita lakukan
di halaman web yang dapat diakses di localhost ketimbang sesi sebelumnya yang
kita tuliskan kodenya di method main. Sehingga dengan adanya halaman ini bisa menyesuaikan
dengan input dari user di halaman tersebut. Untuk file html-nya semua tersimpan di folder
resources/templates, sedangkan untuk script css diletakkan di folder resources/static/css.
untuk html terdapat file index.html yang merupakan halaman utamanya yang menampilkan daftar
mahasiwa yang tersimpan di database, lalu terdapat folder mahasiswa yang berisi:
- detail-form.html -> Menampilkan detail salah satu mahasiswa
- form-edit.html -> Form untuk mengubah data dari salah satu mahasiswa
- form-tambah.html -> Form untuk menambah mahasiswa baru

Lalu untuk file java kita juga menggunakan model dan repository seperti di sesi sebelumnya.
Namun, di sesi kali ini kita juga menambahkan folder controller. Controller ini digunakan
untuk menyediakan method dengan endpoint-nya yang dapat digunakan oleh user. Pada sesi ini terdapat
method untuk mengembalikan file html dan ada juga method untuk CRUD. Contohnya adalah ketika kita membuka
halaman index maka akan menggunakan GetMapping dengan endpoint "/" dan mengembalikan index.html beserta
dengan model Mahasiwa agar di halaman index bisa menampilkan daftar mahasiswa yang tersimpan di database.
Selanjutnya bila kita klik tombol Tambah, maka akan memanggil GetMapping dengan endpoint 
"/mahasiswa/form-tambah" yang method-nya me-return form-tambah.html, sehingga menampilkan halaman form
untuk menambah mahasiswa baru. Lalu setelah kita memasukkan datanya dan kita klik tombol Submit,
maka akan memanggil PostMapping dengan endpoint "mahasiswa/form-tambah" yang di dalam method-nya akan
menyimpan data mahasiswa tersebut ke dalam database. Meskipun endpoint-nya sama dengan yang sebelumnya,
yaitu "/mahasiswa/form-tambah", tapi method-nya berbeda. Dengan method GET akan mengembalikan html,
sedangkan method POST akan menyimpan data mahasiswa yang diinput user.

Lalu di resources, saya juga tambahkan folder db/migration yang digunakan untuk migrasi database.
Terdapat 2 file sql, yang masing-masing berisi perintah sql, yaitu:
- V1.0__201908061400_init_tables.sql -> Membuat table mahasiswa
- V1.1__201908051500_insert_data.sql -> Insert data mahasiswa
Migrasi ini dilakukan dengan menggunakan flyway, dan akan melakukan menjalankan perintah sql tersebut.