import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Menerima input
        System.out.print("Masukkan tahun: ");
        int tahun = scan.nextInt();

        //Panggil function cekKabisat
        boolean isKabisat = cekKabisat(tahun);

        //PrintOutput
        if(isKabisat) {
            System.out.println("Tahun tersebut merupakan tahun kabisat");
        } else {
            System.out.println("Tahun tersebut bukan tahun kabisat");
        }

        //Close scanner
        scan.close();
    }

    //Periksa apakah tahun kabisat atau bukan
    static boolean cekKabisat(int tahun) {
        if(tahun % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
