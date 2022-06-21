CREATE TABLE tb_musisi (
    id_musisi int PRIMARY KEY AUTO_INCREMENT,
    nama_musisi VARCHAR(255) NOT NULL,
    alamat VARCHAR(255),
    nomor_telepon VARCHAR(255) NOT NULL
);

CREATE TABLE tb_instrumen(
    id_instrumen int PRIMARY KEY AUTO_INCREMENT,
    nama_instrumen VARCHAR(255) NOT NULL,
    kunci_musik VARCHAR(255) NOT NULL
);

CREATE TABLE tb_album(
    id_album int PRIMARY KEY AUTO_INCREMENT,
    judul_album VARCHAR(255) NOT NULL,
    id_produser INT NOT NULL,
    tanggal_copyright DATE NOT NULL,
    format VARCHAR(255) NOT NULL,
    FOREIGN KEY(id_produser) REFERENCES tb_musisi(id_musisi)
);

CREATE TABLE tb_lagu(
    id_lagu int PRIMARY KEY AUTO_INCREMENT,
    judul_lagu VARCHAR(255) NOT NULL,
    id_album INT NOT NULL,
    id_pengarang INT NOT NULL,
    FOREIGN KEY(id_album) REFERENCES tb_album(id_album),
    FOREIGN KEY(id_pengarang) REFERENCES tb_musisi(id_musisi)
);

CREATE TABLE tb_instrumen_musisi(
    id_instrumen_musisi int PRIMARY KEY AUTO_INCREMENT,
    id_musisi int NOT NULL,
    id_instrumen int NOT NULL,
    FOREIGN KEY(id_musisi) REFERENCES tb_musisi(id_musisi),
    FOREIGN KEY(id_instrumen) REFERENCES tb_instrumen(id_instrumen)
);

CREATE TABLE tb_penampil(
    id_penampil int PRIMARY KEY AUTO_INCREMENT,
    id_lagu int NOT NULL,
    id_musisi int NOT NULL,
    FOREIGN KEY(id_lagu) REFERENCES tb_lagu(id_lagu),
    FOREIGN KEY(id_musisi) REFERENCES tb_musisi(id_musisi)
);

