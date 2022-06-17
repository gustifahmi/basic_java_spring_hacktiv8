public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        //Inisiasi a, b, c, dan d
        int a = 10, b = 8, c = 12, d = 5;

        //Print hasil
        System.out.printf("Tes ke 1 = %b\n", a > b);
        System.out.printf("Tes ke 2 = %b\n", d < a);
        System.out.printf("Tes ke 3 = %b\n", c >= b);
        System.out.printf("Tes ke 4 = %b\n", d <= c);
        System.out.printf("Tes ke 5 = %b\n", a == 2*d);
        System.out.printf("Tes ke 6 = %b\n", b != c);
        System.out.printf("Tes ke 7 = %b\n", b > a);
        System.out.printf("Tes ke 8 = %b\n", c <= d);
        System.out.printf("Tes ke 9 = %b\n", b == c);
        System.out.printf("Tes ke 10 = %b\n", a != 2*d);
    }
}
