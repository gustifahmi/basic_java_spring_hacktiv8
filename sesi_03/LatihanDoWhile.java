public class LatihanDoWhile {
    public static void main(String[] args) {
        //Inisiasi counter dengan nilai 0
        int counter = 0;

        //Print judul
        System.out.println("Hasil Output: ");
        
        //Jalankan do-while
        do {
            System.out.printf("Perulangan ke-%d\n", counter);
            counter++;
        } while(counter <= 10);
    }
}
