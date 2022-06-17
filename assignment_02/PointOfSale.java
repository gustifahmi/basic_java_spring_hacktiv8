import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {
        //Masukkan Barang yang dijual sesuai petunjuk soal
        Barang barang1 = new Barang(1, "Mouse Bluetooth 5.0", 149999, 10);
        Barang barang2 = new Barang(2, "Headphone Eksternal", 246000, 5);
        Barang barang3 = new Barang(3, "Power Bank 10.000 mAh", 136000, 0);
        Barang barang4 = new Barang(4, "Tripod Kamera", 267999, 20);
        Barang barang5 = new Barang(5, "Smart Watch Xiaomi", 899000, 10);

        //Masukkan ke dalam array
        Barang[] daftarBarang = {barang1, barang2, barang3, barang4, barang5};

        //Print Judul
        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input jumlah beli
        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scan.nextInt();

        //Kasih satu baris
        System.out.println();

        //Inisiasi total
        double total = 0;

        //Inisiasi array barangPembelian
        int[][] barangPembelian = new int[jumlahBeli][2]; 

        //For loop sebanyak jumlahBeli
        for(int i = 1; i <= jumlahBeli; i++) {
            //Terima input kode barang
            System.out.printf("Masukkan kode barang ke-%d: ", i);
            int kode = scan.nextInt();
            
            //Get barang dari daftarBarang
            Barang barang = daftarBarang[kode-1];

            //Get harga barang satuan dikurangi diskon
            double hargaSatuan = barang.getHarga() - (barang.getHarga() * barang.getDiskon() / 100);

            //Terima input quantity
            System.out.printf("Masukkan qty ke-%d: ", i);
            int quantity = scan.nextInt();

            //Masukkan ke array pembelianBarang
            int[] arrayPembelian = new int[2];
            arrayPembelian[0] = kode;
            arrayPembelian[1] = quantity;
            barangPembelian[i-1] = arrayPembelian;

            //Hitung pembayaran untuk barang tersebut
            total += (hargaSatuan * (float)quantity);
        }

        //Kasih satu spasi
        System.out.println();

        //Print struk baris pertama
        System.out.print("No   ");
        System.out.print("Nama Barang              ");
        System.out.print("Harga               ");
        System.out.print(" QTY ");
        System.out.print("  Diskon  ");
        System.out.print("Sub Total");

        //Kasih satu baris
        System.out.println();

        //For loop sebanyak length dari barangPembelian untuk print struk
        for(int j = 0; j < barangPembelian.length; j++) {
            int kodeBarang = barangPembelian[j][0];
            int quantityBarang = barangPembelian[j][1];

            //Ambil objek barang
            Barang barang = daftarBarang[kodeBarang - 1];

            //Print nomor
            System.out.printf("%d    ", (j + 1));

            //Print nama
            String namaBarang = barang.getNamaBarang();
            System.out.print(namaBarang);

            //Sesuaikan spasi agar rapih
            for(int k = 0; k < (25-namaBarang.length()); k++) {
                System.out.print(" ");
            }

            //Print harga
            double hargaBarang = barang.getHarga();
            System.out.printf("Rp. %.2f", hargaBarang);

            //Sesuaikan spasi agar rapih
            for(int l = 0; l < (16-(Double.toString(hargaBarang)).length()); l++) {
                System.out.print(" ");
            }

            //Print QTY
            System.out.printf(" %d ", quantityBarang);

            //Sesuaikan spasi agar rapih
            for(int m = 0; m < (5-(Integer.toString(quantityBarang)).length()); m++) {
                System.out.print(" ");
            }

            //Print Diskon
            double diskon = barang.getDiskon();
            int diskonInt = (int)diskon;
            System.out.print(diskonInt + "%");

            //Sesuaikan spasi agar rapih
            for(int n = 0; n < (6-(Integer.toString(diskonInt)).length()); n++) {
                System.out.print(" ");
            }

            //Print Sub Total
            double subTotal = (hargaBarang - (hargaBarang * diskon / 100)) * quantityBarang;
            System.out.printf("Rp. %.2f", subTotal);

            //Lanjut ke baris berikutnya
            System.out.println();
        }

        //Print total bayar
        System.out.printf("\nTotal Bayar: Rp %.2f\n\n", total);
    }
}

class Barang {
    //Inisiasi private attribute
    private int nomor;
    private double harga, diskon;
    private String namaBarang;

    //Constructor
    Barang(int nomor, String namaBarang, double harga, double diskon) {
        this.nomor = nomor;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.diskon = diskon;
    }

    //Setter harga, diskon, dan namaBarang. Asumsi nomor tidak bisa diubah
    void setharga(double harga) {
        this.harga = harga;
    }

    void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    void setBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    //Getter
    int getNomor() {
        return this.nomor;
    }
    
    double getHarga() {
        return this.harga;
    }
    
    double getDiskon() {
        return this.diskon;
    }
    
    String getNamaBarang() {
        return this.namaBarang;
    }
}