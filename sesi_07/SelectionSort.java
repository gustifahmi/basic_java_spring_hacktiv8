import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scan.nextInt();

        //Inisiasi array data
        int[] data = new int[jumlahData];

        //Terima input data
        System.out.println("\nInput data\n----------");
        for(int i = 0; i < jumlahData; i++) {
            System.out.printf("Input nilai data ke-%d: ", i+1);
            data[i] = scan.nextInt();
        }
        System.out.println("----------");

        //Tampilkan data sebelum diurutkan
        System.out.println("\nData sebelum diurutkan: ");
        System.out.print("[");
        for(int j = 0; j < jumlahData; j++) {
            System.out.print(data[j]);
            if(j != jumlahData - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        System.out.println("----------");

        //Selection Sort
        for(int k = 0; k < jumlahData - 1; k++) {
            //Data di index k dijadikan pembanding
            int pembanding = data[k];

            //Inisiasi variabel terkecil dan index
            int terkecil = pembanding;
            int index = k;

            //Cek nilai terkecil setelah index k
            for(int l = k + 1; l < jumlahData; l++) {
                if(data[l] < terkecil) {
                    terkecil = data[l];
                    index = l;
                }
            }

            //Jika ada yang lebih kecil dari pembanding, tukar posisi
            data[k] = terkecil;
            data[index] = pembanding;
            
            //Tampilkan data setelah iterasi ke-k
            System.out.printf("Data setelah iterasi ke-%d: ", k + 1);
            System.out.print("[");
            for(int j = 0; j < jumlahData; j++) {
                System.out.print(data[j]);
                if(j != jumlahData - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");
        }
        System.out.print("----------\n");

        //Tampilkan data setelah diurutkan
        System.out.println("\nData setelah diurutkan: ");
        System.out.print("[");
        for(int j = 0; j < jumlahData; j++) {
            System.out.print(data[j]);
            if(j != jumlahData - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        //Close scanner
        scan.close();
    }
}
