package sesi_01;

import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {
        //Inisiasi variable buah, LinkedList berisi tipe data String
        LinkedList<String> buah = new LinkedList<>();

        //Tambahkan isi dari buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        //Print isi dari buah
        System.out.println("Nama Buah: " + buah);

        //Print jumlah buah
        System.out.println("Jumlah Buah: " + buah.size());

        //Tambah di awal dan akhir
        buah.addFirst("Paling atas");
        buah.addLast("Paling bawah");

        //Mengganti isi buah di index 2 dan index 5
        buah.set(2, "Diubah");
        buah.set(5, "Diubah");

        //Print isi buah setelah perubahan
        System.out.println("Nama Buah: " + buah);

        //Inisiasi variable buah2, LinkedList berisi tipe data String
        LinkedList<String> buah2 = new LinkedList<>();

        //Tambahkan isi dari buah
        buah2.add("Jeruk");
        buah2.add("Jambu");
        buah2.add("Apel");
        buah2.add("Melon");
        buah2.add("Semangka");

        //Ambil data pertama
        System.out.println("Data Teratas: " + buah.getFirst());

        //Ambil data terakhir
        System.out.println("Data Teratas: " + buah.getFirst());

        //Ambil data di index 1
        System.out.println("Data NoIndex 1: " + buah.get(1));

        //Ambil data di index 3
        System.out.println("Data NoIndex 3: " + buah.get(3));
    }
}
