public class OperatorPenugasan {
    public static void main(String[] args) {
        //Inisiasi variable kosong a dan b
        int a;
        int b;

        //Assign nilai a dan b
        a = 5;
        b = 10;

        //Tambahkan value a ke b
        b += a;
        System.out.println("Penambahan: " + b);

        //Kurangi value a ke b
        b -= a;
        System.out.println("Pengurangan: " + b);

        //Kalikan value a ke b
        b *= a;
        System.out.println("Perkalian: " + b);

        //Bagi value b dengan a
        b /= a;
        System.out.println("Pembagian: " + b);

        //Cari sisa bagi b dibagi a
        b %= a;
        System.out.println("Sisa bagi: " + b);
    }
}
