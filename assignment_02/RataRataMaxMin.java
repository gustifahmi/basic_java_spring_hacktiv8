import java.util.Arrays;
import java.util.Scanner;

public class RataRataMaxMin {
    public static void main(String[] args) {
        //Inisiasi array berisi 3 item
        int[] arrayBilangan = new int[3];

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Print judul
        System.out.println("Masukkan Bilangan Terbesar, Terkecil, dan Rata-rata\n");

        //Minta input, lalu masukkan ke dalam array
        System.out.print("Masukkan bilangan pertama (X) : ");
        int x = scan.nextInt();
        arrayBilangan[0] = x;

        System.out.print("Masukkan bilangan kedua (Y)   : ");
        int y = scan.nextInt();
        arrayBilangan[1] = y;

        System.out.print("Masukkan bilangan ketiga (Z)  : ");
        int z = scan.nextInt();
        arrayBilangan[2] = z;

        //Sort arrayBilangan
        Arrays.sort(arrayBilangan);

        //Print
        System.out.println("\nHasil:");

        //Hitung rata-rata melalui function hitungRataRata
        double average = hitungRataRata(arrayBilangan);
        System.out.printf("Rata-ratanya adalah: %.2f\n", average);

        //Bilangan terbesar
        System.out.printf("%d adalah bilangan terbesar\n", arrayBilangan[2]);

        //Bilangan terkecil
        System.out.printf("%d adalah bilangan terkecil\n", arrayBilangan[0]);
    }

    //function untuk menghitung rata-rata
    static double hitungRataRata(int[] arrayBilangan) {
        return (float)(arrayBilangan[0] + arrayBilangan[1] + arrayBilangan[2]) / 3;
    }
}
