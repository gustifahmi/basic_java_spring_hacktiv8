public class LatihanWhile {
    public static void main(String[] args) {
        //Inisiasi counter dengan nilai 0
        int counter = 0;

        //Print judul
        System.out.println("Hasil output: ");

        //While loop sampai counter melebihi 10 (10 masih masuk ke dalam while)
        while(counter <= 10) {
            System.out.printf("Perulangan ke-%d\n", counter);

            counter++;
        }
    }
}
