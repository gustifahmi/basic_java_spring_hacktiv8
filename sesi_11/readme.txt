Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Jalankan mongodb
C:\Users\095059>mongo

Buat database baru bernama sesi 11
> use sesi11

Buat collection baru bernama profile
> db.createCollection("profile")

Menambahkan 1 document ke dalam collection profile
> db.profile.insertOne({name: "Sanji", color: "yellow"})

Menambahkan beberapa dokumen sekaligus
> db.profile.insertMany([{name: "Zoro", color: "green"}, {name: "Luffy", color: "red"}])

Menampilkan semua dokumen di collection profile
> db.profile.find()

Memfilter hasil pencarian
> db.profile.find({name: "Luffy"})

Mengupdate salah satu dokumen menggunakan updateOne
> db.profile.updateOne({name: "Luffy"}, {$set: {name: "Chopper"}})

Untuk mengganti dokumen dengan dokumen baru bisa menggunakan replaceOne
> db.profile.replaceOne({name: "Chopper"}, {name: "Luffy", color: "brown"})

Menghapus salah satu dokumen
> db.profile.deleteOne({name: "Sanji"})

Di NoSQL, juga terdapat relasi-relasi, yaitu:
1. One to one, ada 1 field yang didedikasikan untuk menyimpan id dari dokumen di collection lain
2. One to many, di dokumen sebagai many ada 1 field yang didedikasikan untuk menyimpan id dari
   dokumen sebagai one, misal satu orang bisa punya berbagai motor, maka di dokumen setiap motor
   terdapat satu field untuk menyimpan id orang.
3. Many to many, bisa dilakukan dengan membuat collection baru, yang setiap dokumennya terdapat field
   untuk menyimpan id dokumen dari collection A dan id dokumen dari collection B.

Lookup adalah seperti join pada SQL, yaitu untuk menggabungkan beberapa table (atau dalam hal ini
collection). Berikut ini adalah contoh dari lookup:
db.transaksi.aggregate(
    [
        {$lookup: {from: "detail_transaksi", localField: "_id", foreignField:"no_trans", as: "detail"}},
        {$lookup: {from: "pelanggan", localField: "id_pelanggan", foreignField: "_id", as: "customer"}}
    ]
)

Validator untuk memvalidasi dokumen baru yang akan dibuat. Misal untuk validasinya kita namakan
jsonSchema. Lalu, kita definisikan validasinya di dalam jsonSchema, yaitu bsonType-nya
seperti apa, required yang berisi list dari field yang harus dimasukkan, dan juga properties
yang memuat validasi dari masing-masing field, contohnya seperti ini:
db.createCollection("barang",
    {validator: 
        {$jsonSchema: {
            bsonType: "object",
            required: ["namabarang", "hargabarang", "jenisbarang", "description"],
            properties: {
                namabarang: {
                    bsonType: "string",
                    description: {"Nama barang berupa string dan tidak boleh kosong"}
                },
                hargabarang: {
                    bsonType: "number",
                    description: {"Harga barang berupa angka dan tidak boleh kosong"}
                },
                jenisbarang: {
                    bsonType: "objectId",
                    description: {"Jenis barang berupa objectId dan tidak boleh kosong"}
                },
                description: {
                    bsonType: "array",
                    description: {"Deskripsi berupa array dan tidak boleh kosong"}
                    items: {
                        merk: {
                            bsonType: "string",
                            description: {"Merk berupa string dan tidak boleh kosong"}
                        },
                        ukuran: {
                            bsonType: "string",
                            description: {"Ukuran berupa string dan tidak boleh kosong"}
                        },
                        stok: {
                            bsonType: "number",
                            description: {"Stok berupa angka dan tidak boleh kosong"}
                        }
                    }
                }
            }
        }}
    }
)
