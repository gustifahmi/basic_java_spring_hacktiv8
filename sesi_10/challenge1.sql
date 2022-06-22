--Membuat database baru
CREATE DATABASE Challenge1;

--Membuat tabel pegawai
CREATE TABLE tb_pegawai(
    id_pegawai int PRIMARY KEY AUTO_INCREMENT,
    nama_pegawai VARCHAR(255) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    jenis_kelamin ENUM('L', 'P') NOT NULL,
    tanggal_lahir DATE NOT NULL,
    status VARCHAR(255) NOT NULL,
    no_telepon VARCHAR(13) NOT NULL,
    jabatan VARCHAR(255) NOT NULL
);

--Membuat tabel menu
CREATE TABLE tb_menu(
    id_menu int PRIMARY KEY AUTO_INCREMENT,
    nama_menu VARCHAR(255) NOT NULL,
    jenis VARCHAR(255) NOT NULL,
    harga int NOT NULL
);

--Membuat tabel pembeli
CREATE TABLE tb_pembeli(
    id_pembeli int PRIMARY KEY AUTO_INCREMENT,
    nama_pembeli VARCHAR(255) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    jenis_kelamin ENUM('L', 'P') NOT NULL,
    tanggal_lahir DATE NOT NULL,
    status VARCHAR(255) NOT NULL,
    no_telepon VARCHAR(13) NOT NULL,
    pekerjaan VARCHAR(255) NOT NULL
);

--Membuat tabel gaji
CREATE TABLE tb_gaji(
    id_gaji int PRIMARY KEY AUTO_INCREMENT,
    id_pegawai int NOT NULL,
    gaji int NOT NULL,
    tanggal_gaji DATE NOT NULL,
    FOREIGN KEY(id_pegawai) REFERENCES tb_pegawai(id_pegawai)
);

--Membuat tabel transaksi
CREATE TABLE tb_transaksi(
    id_transaksi int PRIMARY KEY AUTO_INCREMENT,
    id_pembeli int NOT NULL,
    id_menu int NOT NULL,
    id_pegawai int NOT NULL,
    tanggal_transaksi DATE NOT NULL,
    FOREIGN KEY(id_pembeli) REFERENCES tb_pembeli(id_pembeli),
    FOREIGN KEY(id_menu) REFERENCES tb_menu(id_menu),
    FOREIGN KEY(id_pegawai) REFERENCES tb_pegawai(id_pegawai)
);

--Menambahkan data ke tabel pegawai
INSERT INTO tb_pegawai(nama_pegawai, alamat, jenis_kelamin, tanggal_lahir, status, no_telepon, jabatan)
VALUES
('Yeni', 'Salakan', 'P', '1992-10-14', 'Lajang', '5678094', 'Cook Assistant'),
('Ikri', 'Taman Siswa', 'L', '1992-04-13', 'Lajang', '677908', 'Supervisor'),
('Martini', 'Bengkulu', 'P', '1989-05-09', 'Menikah', '89345', 'Operation Manager'),
('Hartini', 'Bengkulu', 'P', '1990-03-05', 'Menikah', '12367', 'Manager'),
('Yuni', 'Bengkulu', 'L', '1989-09-04', 'Lajang', '98076', 'General Manager'),
('Santoso', 'Jogjakarta', 'L', '1989-09-08', 'Lajang', '123480', 'Waiter'),
('Piniatry', 'Bengkulu', 'P', '1992-04-09', 'Lajang', '34467', 'Cleaning Service'),
('Astuti', 'Jogjakarta', 'P', '1991-03-06', 'Lajang', '9876', 'Kasir'),
('Tumini', 'Bantul', 'P', '1989-03-02', 'Lajang', '945678', 'Kasir'),
('Yovi', 'Salakan', 'P', '1991-07-25', 'Lajang', '899981928', 'Kepala Koki');

--Menambahkan data ke tabel menu
INSERT INTO tb_menu(id_menu, nama_menu, jenis, harga)
VALUES
(111, 'Javanese Tofu', 'Indonesian Food', 50000),
(112, 'Sirloin Steak', 'Western Food', 70000),
(113, 'Tenderloin Steak', 'Western Food', 90000),
(114, 'Fish Ball Soup', 'Western Food', 75000),
(115, 'Mie Rebus', 'Indonesian Food', 15000),
(116, 'Macaroni Chicken Soup', 'Western Food', 80000),
(117, 'Fruit Punch', 'Beverage', 15000),
(118, 'Mochacino Ice', 'Beverage', 15000),
(119, 'Strawberry Juice', 'Beverage', 10000),
(120, 'Milkshake', 'Beverage', 12000);

--Menambahkan data ke tabel pembeli
INSERT INTO tb_pembeli(id_pembeli, nama_pembeli, alamat, jenis_kelamin, tanggal_lahir, status, no_telepon, pekerjaan)
VALUES
(211, 'Wiwit', 'Bengkulu', 'P', '1989-03-01', 'Lajang', '567890', 'Apoteker'),
(212, 'Ayu', 'Malang', 'P', '1988-06-03', 'Menikah', '5690235', 'Dosen'),
(213, 'Nengsih', 'Solo', 'P', '1980-07-09', 'Menikah', '765489', 'Asisten'),
(214, 'Albert', 'Australia', 'P', '1989-09-08', 'Lajang', '346789', 'Analis'),
(215, 'Salmi', 'Bengkulu', 'P', '1989-09-07', 'Menikah', '907654', 'Perawat'),
(216, 'Rahmat', 'Lombok', 'L', '1988-08-06', 'Menikah', '987654', 'Kontraktor'),
(217, 'Budiana', 'Bali', 'P', '1987-03-01', 'Menikah', '12468', 'Analis'),
(218, 'Wati', 'Bengkulu', 'P', '1980-07-06', 'Menikah', '987766', 'Programmer'),
(219, 'Rayan Nazriel', 'Bangladesh', 'L', '1989-09-10', 'Lajang', '6790007', 'Perawat'),
(220, 'Alex', 'Papua', 'L', '1990-03-04', 'Lajang', '9988664', 'Dokter');

--Menambahkan data ke tabel gaji
INSERT INTO tb_gaji(id_gaji, id_pegawai, gaji, tanggal_gaji)
VALUES
(2001, 1, 2000000, '2012-12-01'),
(2002, 2, 1800000, '2012-12-01'),
(2003, 3, 1500000, '2012-12-01'),
(2004, 4, 3500000, '2012-12-01'),
(2005, 5, 4000000, '2012-12-01'),
(2006, 6, 2500000, '2012-12-01'),
(2007, 7, 1500000, '2012-12-01'),
(2008, 8, 1000000, '2012-12-01'),
(2009, 9, 3500000, '2012-12-01'),
(2010, 10, 3500000, '2012-12-01');

--Menambahkan data ke tabel transaksi
INSERT INTO tb_transaksi(id_transaksi, id_pembeli, id_menu, id_pegawai, tanggal_transaksi)
VALUES
(1001, 211, 111, 9, '2012-09-09'),
(1002, 211, 112, 9, '2012-11-08'),
(1003, 212, 113, 10, '2012-11-10'),
(1004, 213, 114, 10, '2012-11-28'),
(1005, 213, 115, 9, '2012-11-28'),
(1006, 214, 116, 9, '2012-11-29'),
(1007, 215, 117, 10, '2012-12-08'),
(1008, 216, 118, 9, '2012-12-08'),
(1009, 217, 119, 9, '2012-12-18'),
(1010, 218, 119, 9, '2012-12-18'),
(1011, 219, 120, 10, '2012-12-28'),
(1012, 220, 120, 10, '2012-12-29');

--Menampilkan seluruh kolom di masing-masing tabel
SELECT * FROM tb_pegawai;
SELECT * FROM tb_menu;
SELECT * FROM tb_pembeli;
SELECT * FROM tb_gaji;
SELECT * FROM tb_transaksi;

--Membuat view data_gaji
CREATE VIEW data_gaji AS
SELECT p.id_pegawai, p.nama_pegawai, p.jabatan, g.gaji, g.tanggal_gaji
FROM tb_pegawai p JOIN tb_gaji g
ON p.id_pegawai = g.id_pegawai
ORDER BY p.id_pegawai ASC;

--Membuat view data_transaksi
CREATE VIEW data_transaksi AS
SELECT t.id_transaksi, pb.nama_pembeli, m.nama_menu, pg.nama_pegawai, t.tanggal_transaksi
FROM tb_transaksi t
JOIN tb_pembeli pb ON t.id_pembeli = pb.id_pembeli
JOIN tb_menu m ON t.id_menu = m.id_menu
JOIN tb_pegawai pg ON t.id_pegawai = pg.id_pegawai
ORDER BY id_transaksi ASC;

--Hapus salah satu data berdasarkan id
DELETE FROM tb_transaksi WHERE id_transaksi = 1012;