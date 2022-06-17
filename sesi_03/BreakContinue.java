public class BreakContinue {
    public static void main(String[] args) {
        //Inisiasi i sebagai index
        int i;

        //For loop 4 kali
        for(i = 0; i < 4; i++) {
            //Saat index lebih besar dari 3, break dari for loop
            if(i >= 3) {
                break;
            }

            //Print Selamat belajar
            System.out.println("Selamat belajar!");
            
            /*
            Saat index lebih besar dari 2, langsung lanjut ke perulangan berikutnya,
            abaikan perintah berikutnya yang masih di dalam for loop
            */
            if(i >= 2) {
                continue;
            }

            //Print Java
            System.out.println("JAVA");
        }

        //Print index
        System.out.println(i);
    }
}
