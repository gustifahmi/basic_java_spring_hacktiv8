public class OperatorBitwise {
    public static void main(String[] args) {
        //Assign nilai x dan y
        int x = 10;
        int y = 15;

        //Inisiasi hasil
        int hasil;

        //Bitwise and
        hasil = x & y;
        System.out.println("x & y = " + hasil);

        //Bitwise or
        hasil = x | y;
        System.out.println("x | y = " + hasil);

        //Bitwise xor
        hasil = x ^ y;
        System.out.println("x ^ y = " + hasil);

        //Bitwise complement
        hasil = ~x;
        System.out.println("~x = " + hasil);

        //Left shift
        hasil = x << 2;
        System.out.println("x << 2 = " + hasil);

        //Right shift
        hasil = x >> 2;
        System.out.println("x >> 2 = " + hasil);
        
        //Zero fill right shift
        hasil = x >>> 2;
        System.out.println("x >>> 2 = " + hasil);
    }
}
