import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        //Inisiasi y1 dan y2
        int y1, y2;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input y1
        System.out.print("Masukkan nilai y1: ");
        y1 = scan.nextInt();

        //Terima input y2
        System.out.print("Masukkan nilai y2: ");
        y2 = scan.nextInt();

        //Hitung hasil x1 dan x2 sesuai soal
        int x1 = (y1 + y2) * (y1 +y2);
        int x2 = (y1 % 4) * y2;

        //Kasih satu baris
        System.out.println();

        //Print nilai x1 dan x2
        System.out.printf("Nilai X1 adalah: %d\n", x1);
        System.out.printf("Nilai X2 adalah: %d\n", x2);

        //Kasih satu baris
        System.out.println();

        //Print 3 kondisi sesuai soal
        boolean kondisi1 = x1 >= x2;
        System.out.printf("X1 besar sama dengan X2 ===> %b\n", kondisi1);

        boolean kondisi2 = x2 >= x1;
        System.out.printf("X2 besar sama dengan X1 ===> %b\n", kondisi2);

        boolean kondisi3 = x1 % 4 == ++x2 % 5;
        System.out.printf("X1 mod 4 == ++X2 mod 5 ===> %b\n", kondisi3);

        //Kasih satu baris
        System.out.println();
    }
}
