public class LatihanForLoop {
    //Function untuk loop bintang
    public static void loopBintang() {
        //Inisiasi nilai variabel baris dan bintangPerBaris
        int baris = 6, bintangPerBaris = 5;

        //For loop sesuai dengan jumlah baris
        for(int i = 0; i < baris; i++) {
            //For loop sesuai dengan jumlah bintangPerBaris
            for(int j = 0; j < bintangPerBaris; j++) {
                //Print bintang untuk satu baris, dalam contoh ini sebanyak 5
                System.out.print("*");
            }

            //Print new line untuk memberi jeda dengan baris berikutnya
            System.out.println("");
        }
    }

    //Function untuk loop angka
    public static void loopAngka() {
        //Inisiasi nilai maksimum
        int maksimum = 10;

        //For loop sampai maksimum (nilai maksimum juga termasuk ke dalam for loop)
        for(int i = 0; i <= maksimum; i++) {
            //Print nilai i
            System.out.printf("%d ", i);
        }

        //Print new line untuk memberi jeda dengan function loopGanjil
        System.out.println();
    }

    public static void loopGanjil() {
        //Inisiasi nilai maksimum
        int maksimum = 20;

        //For loop dimulai dari i = 1 dan i ditambahkan 2 sampai maksimum (maksimum termasuk jika ganjil)
        for(int i = 1; i <= maksimum; i += 2) {
            System.out.printf("%d ", i);
        }
        
        //Kasih satu baris
        System.out.println();
    }

    public static void main(String[] args) {
        //Jalankan masing-masing function
        loopBintang();
        loopAngka();
        loopGanjil();
    }
}
