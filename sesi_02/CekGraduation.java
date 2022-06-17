import java.util.Scanner;

public class CekGraduation {
    public static void main(String[] args) {
        //Inisiasi nilai dan nama
        int nilai;
        String nama;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Input nama dan nilai dan assign ke variabel nama dan nilai
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        //Cek lulus atau tidak, minimal nilai 70
        if(nilai >= 70) {
            System.out.printf("Selamat %s, anda lulus\n", nama);
        } else {
            System.out.printf("Maaf %s, anda gagal\n", nama);
        }
    }
}
