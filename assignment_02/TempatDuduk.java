import java.util.Scanner;

public class TempatDuduk {
    public static void main(String[] args) {
        //Inisiasi array tempatDuduk
        String[][] tempatDuduk = new String[2][3];

        //Inisiasi maxCharacter
        int maxCharacter = 0;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input dari user
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Siapa yang akan duduk di kelas (%d,%d): ", i, j);
                String input = scan.nextLine();
                tempatDuduk[i][j] = input;

                //Ubah maxCharacter jika jawaban terbaru memiliki character paling banyak
                if(input.length() > maxCharacter) {
                    maxCharacter = input.length();
                }
            }
        }

        //Print output
        System.out.println("==============================");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                String siswa =  tempatDuduk[i][j];
                System.out.printf("|%s|", siswa);
                
                //Print spasi yang disesuaikan agar terlihat rapih
                for(int k = 0; k < maxCharacter-siswa.length() + 5; k++) {
                    System.out.printf(" ");
                }
            }

            //Print line berikutnya
            System.out.println();
        }
        System.out.println("==============================");
    }
}
