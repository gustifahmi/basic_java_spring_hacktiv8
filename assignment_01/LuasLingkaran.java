import java.util.Scanner;
import java.lang.Math;

public class LuasLingkaran {
    public static void main(String[] args) {
        //Inisiasi pi dengan value 3.14
        double pi = 3.14;

        //Inisiasi variabel kosong, yairtu luas dan r(jari-jari)
        double luas;
        int r;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input r
        System.out.print("Masukkan nilai jari-jari: ");
        r = scan.nextInt();

        //Print luas lingkaran
        System.out.printf("Luas lingkaran sebesar %.2f\n", (pi * Math.pow(r, 2)));
    }
}
