import java.util.Arrays;
import java.util.Scanner;

//Binary Search
public class BinarySearch {
    public static int binarySearch(int[] data, int angkaDicari) {
        //Inisiasi first, last, dan middle
        int first = 0;
        int last = data.length;
        int middle = data.length / 2;

        //While loop selagi mencari angka
        while(first <= last) {
            if (data[middle] < angkaDicari) {
                first = middle + 1;
            } else if (data[middle] > angkaDicari) {
                last = middle - 1;
            } else {
                return (middle + 1);
            }

            middle = (first + last) / 2;
        }

        //Ini terjadi jika sudah keluar dari while, artinya tidak ditemukan angka tersebut
        return 0;
    }

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

        //Sort array
        Arrays.sort(data);

        //Terima input angka yang ingin dicari
        System.out.print("Masukkan angka yang ingin dicari: ");
        int angkaDicari = scan.nextInt();

        //Panggil function binarySearch dan print output
        int urutan = binarySearch(data, angkaDicari);
        if(urutan != 0) {
            System.out.printf("Angka %d ada di urutan ke-%d\n", angkaDicari, urutan);
        } else {
            System.out.println("Angka tidak ada di dalam list");
        }
    }
}
