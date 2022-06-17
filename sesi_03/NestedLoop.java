public class NestedLoop {
    public static void main(String[] args) {
        //Inisiasi x dan y
        int x, y;

        //For loop 6 kali (0-5, 5 termasuk)
        for(x = 0; x <= 5; x++) {
            //For loop 4 kali (0-3, 3 termasuk)
            for(y = 0; y <= 3; y++) {
                //Print laporan perulangan
                System.out.printf("Perulangan [x=%d, y=%d] \n", x, y);
            }
        }
    }
}
