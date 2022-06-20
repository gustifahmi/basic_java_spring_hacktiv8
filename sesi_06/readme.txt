Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Pastikan dahulu, kita sudah mendownload Git dan sudah memiliki akun Github/Gitlab (dalam contoh
ini kita gunakan Github). Lalu untuk membuat repository baru di github, bisa dilakukan dengan
klik tombol New di samping tulisan Recent Repository. Lalu kita buat nama repository, lalu juga
aksesnya apakah public ataukah private. Kita juga bisa menentukan default branch dari repo tersebut di
link ini https://github.com/settings/repositories biasanya main atau master. Saya menggunakan
master. Lalu klik tombol Create Repository. Maka repository sudah terbuat. Lalu jangan lupa mencopy
link gitnya dengan klik tombol hijau bertuliskan Code, lalu terdapat link https yang bisa dicopy.
Lalu untuk menghubungkan project kita ke repo baru tersebut, coba jalankan di terminal/command prompt.
git init
git config --global user.name "Nama Kamu"
git config --global user.email "emailkamu@domain"
git remote add origin [Link Git]

Untuk perintah di atas silahkan ganti [Link Git] dengan link yang tadi sudah dicopy.

Setelah menjalankan perintah di atas maka kita sudah terhubung dengan repo git tersebut
dan juga sudah mengkonfigurasikan user name dan email kita. Untuk mengecek config user name
atau email bisa dilakukan dengan perintah seperti ini:
git config --global user.name
git config --global user.email

Lalu untuk mengecek git yang terhubung bisa dilakukan dengan perintah berikut:
git remote -v

Jika kita ingin menambahkan file kita ke repo, pertama kita tentukan dulu file/folder yang
ingin kita tambahkan dengan perintah:
git add [NamaFile/Nama Folder]

Jika kita ingin menambahkan semua file/folder, bisa dengan perintah:
git add .

Kita bisa melihat file/folder apa saja yang sudah di-add, lalu

Setelah add, file/folder belum terupload, kita perlu melakukan commit dengan perintah berikut:
git commit -m "Masukkan Pesan"

Setelah commit pun, masih belum terupload ke Github, lalu kita perlu melakukan push:
git push origin namaBranch
karena kita menggunakan default branch, yaitu master, kita bisa lakukan perintah:
git push origin master

Setelah dipush, baru kita bisa melihat file/folder tersebut di Github.

Lalu misal kita bekerja di dalam sebuah tim dan masing-masing sedang mengerjakan
pekerjaannya. Untuk terhindar konflik dengan pekerjaan yang lain, masing-masing
orang sebaiknya membuat branch masing-masing. Bisa dilakukan dengan perintah:
git branch namaBranch
atau kita ingin langsung pindah ke branch tersebut, bisa dengan perintah:
git checkout -b namaBranch

Misal, branch sudah dibuat dan kita ingin berpindah branch dilakukan dengan perintah:
git checkout namaBranch

Misal, ada update di branch master dan kita ingin agar update tersebut juga bisa
ada di project local kita, maka kita bisa lakukan perintah berikut ini:
git pull origin namaBranch
karena kita ingin pull dari master maka perintahnya adalah:
git pull origin master

Lalu, misal pekerjaan kita sudah selesai dan sudah dipush ke branch, lalu kita ingin mengupdate
pekerjaan kita ke default branch, yaitu master. Kita bisa lakukan dengan membuat pull request
melalui Github langsung. Misal kita bekerja di dalam sebuah tim, maka sebaiknya kita menambahkan
reviewer, terutama atasan kita dan kalau perlu rekan-rekan yang punya kepentingan, tergantung
bagaimana prosedur di tim tersebut. Setelah di-approve oleh atasan dan rekan-rekan, barulah
kita bisa merge pekerjaan kita ke branch master.