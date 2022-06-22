import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        //Inisiasi variabel belanjaan, diskon, bayar, dan kartu
        int belanjaan;
        int diskon = 0;
        String kartu;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input kartu dan belanjaan
        System.out.print("Apakah ada kartu member: ");
        kartu = scan.nextLine().toLowerCase();
        System.out.print("Total belanjaan: ");
        belanjaan = scan.nextInt();

        //Hitung diskon berdasarkan kartu dan jumlah belanjaan
        if(kartu.equals("ya") || kartu.equals("iya") || kartu.equals("yes")
        || kartu.equals("y") || kartu.equals("ada")) {
            if(belanjaan > 500000) {
                diskon = 50000;
            } else if(belanjaan > 100000) {
                diskon = 15000;
            }
        } else {
            if(belanjaan > 100000) {
                diskon = 5000;
            }
        }

        //Print jumlah pembayaran
        System.out.printf("Total Bayar: Rp %d", (belanjaan - diskon));

        //Close scanner
        scan.close();
    }
}
