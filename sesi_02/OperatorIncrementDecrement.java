public class OperatorIncrementDecrement {
    public static void main(String[] args) {
        //Assign nilai x dan y
        int x = 20;
        int y = 40; 

        //Operator Aritmatika
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y / x = " + (y / x));
        System.out.println("y % x = " + (y % x));
        
        //Increment dan Decrement
        System.out.println("x++ = " + (x++));
        System.out.println("x-- = " + (x--));

        //Perbedaan x++ dengan ++x
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));

    }
}
