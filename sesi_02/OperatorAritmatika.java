import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        //Inisiasi angka1, angka2, dan hasil
        int angka1;
        int angka2;
        int hasil;

        //Jalankan scanner
        Scanner keyboard = new Scanner(System.in);

        //Penjumlahan
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = " + hasil);

        //Pengurangan
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 - angka2;
        System.out.println("Hasil Pengurangan = " + hasil);

        //Perkalian
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + hasil);

        //Pembagian
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = " + hasil);

        //Sisa Bagi
        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 % angka2;
        System.out.println("Sisa Bagi = " + hasil);

        //Close scanner
        keyboard.close();
    }
}
