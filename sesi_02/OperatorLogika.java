public class OperatorLogika {
    public static void main(String[] args) {
        //Assign nilai x dan y
        boolean x = true;
        boolean y = false;

        //Logical and
        System.out.println("x && y = " + (x && y));
        
        //Logical or
        System.out.println("x || y = " + (x || y));
        
        //Logical not
        System.out.println("!(x && y) = " + !(x && y));
    }
}
