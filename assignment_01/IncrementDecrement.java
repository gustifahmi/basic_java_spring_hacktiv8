public class IncrementDecrement {
    public static void main(String[] args) {
        //Inisialisasi variabel a, b, c, dan d
        int a = 0, b = 0, c = 9, d = 9;

        //Print ke 1
        System.out.println("Print ke 1");
        System.out.println("A = " + a++); //0
        System.out.println("B = " + ++b); //1
        System.out.println("C = " + c--); //9
        System.out.println("D = " + --d); //8

        //Print ke 2
        System.out.println("\nPrint ke 2");
        System.out.println("A = " + a++); //1
        System.out.println("B = " + ++b); //2
        System.out.println("C = " + c--); //8
        System.out.println("D = " + --d); //7

        //Print ke 3
        System.out.println("\nPrint ke 3");
        System.out.println("A = " + a++); //2
        System.out.println("B = " + ++b); //3
        System.out.println("C = " + c--); //7
        System.out.println("D = " + --d); //6

        //Print ke 4
        System.out.println("\nPrint ke 4");
        System.out.println("A = " + a++); //3
        System.out.println("B = " + ++b); //4
        System.out.println("C = " + c--); //6
        System.out.println("D = " + --d); //5
    }
}
