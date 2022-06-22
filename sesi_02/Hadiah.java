import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        //Inisiasi variabel belanja
        int belanja;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in); 

        //Assign input dari user ke variabel belanja
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();

        //If clause, jika belanjaan senilai Rp 100.000
        if(belanja == 100000) {
            System.out.printf("\nSelamat, anda mendapatkan hadiah!\n");
        }

        //Print terima kasih
        System.out.println("Terima kasih...");

        //Close scanner
        scan.close();
    }
}
