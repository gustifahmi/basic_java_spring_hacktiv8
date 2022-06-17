public class ContohArray {
    public static void main(String[] args) {
        //Inisiasi array bahasa yang berisi 4 item bertipe String
        String[] bahasa = {"ReactJS", "Java", "Golang", "Python"};

        //Print setiap item di dalam array bahasa
        for(int i = 0; i < bahasa.length; i++) {
            System.out.printf("Indeks ke-%d: %s\n", i, bahasa[i]);
        }
    }
}
