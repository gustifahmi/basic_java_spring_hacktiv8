Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Pada sesi 21, sayab belajar mengenai Firebase. Kegunaaan dari Firebase adalah agar dapat
mengirim push notification. Dengan begitu kita akan mengirim notifikasi ke Firebase, lalu Firebase
yang akan mengirim notifikasi ke perangkat yang sesuai.

Terdapat 2 jenis notifikasi, yaitu:
1. Topic Notification
   Notifikasi berdasarkan topic tertentu. Pengguna bisa berlangganan ke suatu topik dan Firebase
   mengirim notifikasi kepada yang berlangganan saja
2. Direct Notification
   Notifikasi yang ditujukan menerima parameter berupa target dan akan mengirimkannya ke target tersebut.

Langkah-langkah agar bisa terhubung dengan firebase adalag sebagai berikut:
1. Pastikan punya akun firebase. Jika belum, maka harus buat akun terlebih dahulu.
2. Bukan Firebase console di https://console.firebase.google.com
3. Buat project baru
4. Setelah project dibuat dan kita masuk ke halaman project tersebut,
   klik logo setting (di samping project overview), lalu klik project settings
5. Klik tab "Service Accounts"
6. Klik Generate New Private Key, selanjutnya akan mendownload sebuah file json.
7. Letakkan file tersebut di daiam project DemoFirebase, saya meletakkannya di src/main/resources
8. Tambahkan di application.properties
9. Buat file model untuk Note, caranya sama saja seperti ketika membuat model lain. attributenya
   antara lain: String subject, String content, Map<String, String> data, String image
10. Buat file service untuk Firebase. Service tersebut memiliki method sendNotification yang akan
    melakukan build sebuah objek Notification dan sebuah objek Message
    (dengan setNotification(notification)), lalu akan mengirim message dengan FirebaseMessaging.
11. Buat controller untuk note. Untuk demo ini saya membuat method untuk mengirim notifikasi
    yang akan memamnggil method sendNotification dari FirebaseMessagingService
12. Tambahkan method firebaseMessaging di DemoFirebaseApplication.java, untuk membuat objek
    GoogleCredentials, pastikan untuk menggunakan path menuju file json tadi di dalam parameter pada
    constructor ClassPathResource.

Itu adalah langkah-langkah pada sesi ini. 