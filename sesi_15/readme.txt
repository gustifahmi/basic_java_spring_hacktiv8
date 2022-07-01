Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Di sesi_15 ini saya belajar menggunakan JPA pada proyek Spring Boot. JPA ini bisa kita gunakan
untuk mempermudah pengerjaan kita saat ingin melakukan perintah DDL yang terdiri dari insert, select,
update, dan delete ke database. Dengan JPA, kita bisa melakukan perintah-perintah DDL dengan
method java yang dimiliki JPA. Untuk bisa menggunakan JPA, pastikan terdapat dependency
spring-boot-starter-data-jpa di pom.xml yang bisa kita tambahkan saat membuat proyek spring baru.

Lalu kita juga perlu menambahkan di application.properties seperti ini:

application.properties
----------------------
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/jpa_book?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update
----------------------------------------------------------------

pada file com/belajar/spring terdapat folder model, folder repository, dan
file BelajarSpringJpaBookApplication.java yang terdapat method main
untuk menjalankan aplikasi ini.

Pada folder model, terdapat 4 file, yaitu Book, BookCategory, Course, dan Student.
Keempat file ini akan menjadi sebuah entity atau sebuah table di database jpa_book (saya
sudah buat terlebih dahulu databasenya). Di keempat file ini, sebelum public class
saya tambahkan annotation @Entity dan @Table(name = "nama_table") agar bisa menghubungkan
dengan table di MySQL. Untuk primary key (di keempat model ini saya namakan id), sebelumnya
saya tambahkan annotation @Id yang menandakan ini merupakan kolom primary key dan
@GeneratedValue(strategy = GenerationType.IDENTITY) yang menandakan id akan auto increment.
Sedangkan untuk kolom lain saya tambahkan annotation @Column(name = "nama_column").

Terdapat juga relasi antar table, yaitu BookCategory dan Book memiliki relasi one-to-many,
berarti satu BookCategory bisa terdapat banyak Book. pada BookCategory saya tambahkan attribute
books yang bertipe data List<Book> yang menyimpan List berisi book yang BookCategory-nya sama.
Lalu untuk books, saya tambahkan annotation @OneToMany. Sedangkan pada Book.java saya tambahkan
attribute bookCategory yang bertipe data BookCategory untuk menandakan kategori dari book tersebut.
Lalu untuk attribute bookCategory, saya tambahkan annotation @ManyToOne.

Lalu juga terdapat relasi many-to-many yaitu Course dan Student, dengan keduaanya saya menambahkan
attribute bertipe data set(di course saya tambahkan Set<Student> student, sedangkan di Student
saya tambahkan Set<Course> course). Lalu untuk masing-masing attribute tersebut, saya tambahkan
annotation @ManyToMany. Namun ada perbedaan, salah satu dari attribute tersebut saya tambahkan method
@JoinTable(name = "nama_table_gabungan", joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false, updatable = false)},
			inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id",
			nullable = false, updatable = false)
Saya menambahkan annotation tersebut di file Student.java di attribute course.

Sedangkan di folder repository, saya membuat sebuah interface untuk masing-masing table,
yang masing-masing mengextend JpaRepository, sehingga bisa menggunakan mehod-method milik JPA.
Lalu untuk method main di file BelajarSpringJpaBookApplication.java, baru saya buat objek-objek
san mencoba untuk menambah ke database dan juga get dari database dan berhasil berjalan.
