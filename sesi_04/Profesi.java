import java.util.Scanner;

public class Profesi {
    public static void main(String[] args) {
        //Inisiasi array kosong bernama profesi dengan batas 5 item dan menampung tipe data String
        String[] profesi = new String[5];

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Loop sebanyak 5 kali, terima input 5 jenis profesi
        for(int i = 0; i < profesi.length; i++) {
            System.out.printf("Masukkan profesi ke-%d: ", i+1);
            profesi[i] = scan.nextLine();
        }

        //Print garis panjang sebagai pembatas
        System.out.println("-------------------------");

        //For each, looping semua item di dalam array profesi
        for(String namaProfesi: profesi) {
            System.out.println(namaProfesi);
        }
    }
}
