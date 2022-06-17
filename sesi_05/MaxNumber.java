//Class MaxNumber
public class MaxNumber {
    public static void main(String[] args) {
        //Print maxnumber yang integer
        System.out.printf("Max Number adalah: %d\n", maxNumber(10, 20));

        //Kasih satu baris
        System.out.println();
        
        //Print maxnumber yang integer
        System.out.printf("Max Number adalah: %.2f\n", maxNumber(4.5, 7.5));
    }

    //Method maxNumber, return angka terbesar dari 2 angka
    static double maxNumber(double a, double b) {
        System.out.println("Masuk ke method maxNumber yang double");

        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Method maxNumber, tapi kali ini menerima parameter int, sehingga walaupun nama sama, tetapi overload
    static int maxNumber(int a, int b) {
        System.out.println("Masuk ke method maxNumber yang integer");

        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
