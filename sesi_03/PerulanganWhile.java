import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        //Inisiasi running, counter, dan jawab
        boolean running = true;
        int counter = 0;
        String jawab;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //While loop yang aktif selama running = true
        while(running) {
            //Print pertanyaan
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab ya atau iya jika ingin keluar> ");

            //Terima input jawaban
            jawab = scan.nextLine().toLowerCase();

            /*
            Jika jawaban "ya" atau "iya", ubah running menjadi false, namun belum di-break
            sehingga masih lanjut ke baris berikutnya
            */
            if(jawab.equals("ya") || jawab.equals("iya")) {
                running = false;
            }

            //Increment nilai counter
            counter++;
        }

        //Print jumlah perulangan
        System.out.printf("Anda sudah melakukan perulangan sebanyak %d kali\n", counter);

        //Close scanner
        scan.close();
    }
}
