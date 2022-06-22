--Tabel tb_orangtua
CREATE TABLE tb_orangtua(
    id_orangtua int PRIMARY KEY AUTO_INCREMENT,
    nama_orangtua VARCHAR(255) NOT NULL,
    umur int NOT NULL
);

--Tabel tb_dosen
CREATE TABLE tb_dosen(
    id_dosen int PRIMARY KEY AUTO_INCREMENT,
    nama_dosen VARCHAR(255) NOT NULL,
    umur int NOT NULL
);

--Tabel tb_mahasiswa
CREATE TABLE tb_mahasiswa(
    nim int PRIMARY KEY AUTO_INCREMENT,
    nama_mahasiswa VARCHAR(255) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    tanggal_lahir DATE NOT NULL,
    id_orangtua INT NOT NULL,
    id_dosen INT NOT NULL,
    FOREIGN KEY(id_orangtua) REFERENCES tb_orangtua(id_orangtua),
    FOREIGN KEY(id_dosen) REFERENCES tb_dosen(id_dosen)
);

--Tabel tb_matkul
CREATE TABLE tb_matkul(
    id_matkul int PRIMARY KEY AUTO_INCREMENT,
    nama_matkul VARCHAR(255) NOT NULL,
    sks int NOT NULL,
    harga int NOT NULL
);

--Tabel tb_nilai
CREATE TABLE tb_nilai(
    id_nilai int PRIMARY KEY AUTO_INCREMENT,
    nim int NOT NULL,
    id_matkul int NOT NULL,
    nilai int NOT NULL,
    FOREIGN KEY(nim) REFERENCES tb_mahasiswa(nim),
    FOREIGN KEY(id_matkul) REFERENCES tb_matkul(id_matkul)
);