import java.util.Scanner;

public class HitungDiskon {
    public static void main(String[] args) {
        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input pembelian dan diskon
        System.out.print("Masukkan jumlah pembelian: ");
        int pembelian = scan.nextInt();

        //Panggil function hitungPembayaran
        int pembayaran = hitungPembayaran(pembelian);
        System.out.printf("Total pembayaran sebesar: %d", pembayaran);

        //Close scanner
        scan.close();
    }

    //Function hitungPembayaran
    static int hitungPembayaran(int pembelian) {
        if(pembelian >= 100000) {
            System.out.println("Diskon yang didapatkan sebesar: 10%");
            return (int) (pembelian - (pembelian * 10 / 100));
        } else {
            System.out.println("Diskon yang didapatkan sebesar: 0%");
            return pembelian;
        }
    }
}
