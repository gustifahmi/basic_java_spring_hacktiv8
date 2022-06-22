import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        //Inisiasi variabel lampu
        String lampu;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input, lalu assign ke lampu
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine().toLowerCase();

        //Switch-case
        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }

        //Close scanner
        scan.close();
    }
}
