Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Di sesi 18 ini, saya mempelajari cara untuk authentication (autentikasi). Dengan autentikasi ini, kita bisa
membatasi user untuk melakukan autentikasi atau dengan kata lain login terlebih dahulu sebelum
mengakses beberapa API yang khusus untuk user yang sudah login.

Untuk autentikasi menggunakan JWT, kita menggunakan dependecy jjwt dari io.jsonwebtoken, kemudian
kita juga perlu menambahkan beberapa file java yang diperlukan, yaitu:
- Model user (dalam demo ini, saya namakan UserInfo,java)
  Tentu perlu entity user untuk menyimpan field yang dibutuhkan, biasanya username dan password.
- Model JwtRequest dan JwtResponse
  Ini untuk memudahkan kita saat menerima request dari user dan saat memberikan response ke user,
  saat user melakukan autentikasi. Saat menerima request, kita bisa menerima request body menjadi
  suatu objek java sesuai dengan model JwtResponse dan kita akan memberikan response body yang bisa
  kita sesuaikan dengan model JwtResponse
- Repository dan service untuk User
  Seperti yang sudah dipelajari pada sesi-sesi sebelumnya
  - Config
    Di folder jwt/config terdapat 4 file, yaitu:
    - JwtAuthenticationEntryPoint
      Terdapat satu method yaitu commence, yang mengirim error unauthorized untuk servlet response
    - JwtRequestFilter
      Untuk memfilter jwt saat user mengakses api yang butuh autorisasi. Memastikan autorisasi
      sesuai, yaitu Bearer <jwttoken yang didapat saat autentikasi>
    - JwtToken
      Untuk konfigurasi token, seperti generate token, mengecek apakah token expired, validasi token, dll
    - WebSecurityConfig
      Di antara method-method yang ada di class ini, seperti untuk mengenkripsi password. Lalu ada juga
      method configure, yang bisa kita gunakan untuk mengatur endpoint mana saja yang tidak butuh autorisasi
      (signup dan login) dan mana saja yang butuh autorisasi (dalam demo ini, yaitu blog).
  - Folder jwt/xception
    Untuk menghandle exception
  - UserInfoController
    Untuk membuat user baru (sign up), untuk sign up tidak perlu login seperti dahulu seperti pada
    umumnya ketika kita membuat suatu akun
  - AuthController
    Untuk melakukan login (autentikasi). Request body yang dibutuhkan memiliki 2 field, yaitu username
    dan password. Jika username dan password sesuai dengan yang tersimpan di database, maka login berhasil
    dan akan mengembalikan sebuah token.

Untuk langkah-langkah agar bisa mengakses api blog agar tidak unauthorized, adalah seperti ini:
1. Buat akun dengan endpoint /user dengan method post. Pastikan untuk mengingat username dan password
   karena akan digunakan untuk langkah selanjutnya. Terutama password, karena jika kita lupa, kita tidak
   bisa melihat di database, karena yang di database adalah password yang sudah dienkripsi. Jika kita
   sudah pernah membuat akun dan masih mengingat username dan password tersebut. Kita bisa langsung ke
   langkah berikutnya tanpa harus membuat akun lagi
2. Melakukan autentikasi (login) di endpoint /authenticate dan masukkan request body dengan field
   username dan password sesuai dengan yang telah tersimpan di database. Selanjutnya jika berhasil,
   akan mengembalikan response body, yaitu token. Copy token tersebut karena akan kita gunakan
   di langkah tersebut
3. Masukkan token tersebut saat coba mengakses api blog. Jika menggunakan postman, langkah-langkahnya
   adalah seperti berikut:
   1) Klik authorization
   2) Pilih type "Bearer Token"
   3) Masukkan token yang tadi sudah kita copy ke isian "Token"