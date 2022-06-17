public class MultiDimensi {
    public static void main(String[] args) {
        //Inisiasi framework, sebuah multidimensi array
        String[][] framework = {{"Java", "Kotlin"}, {"React", "ReactJS"}, {"Python", "Django"}};

        //For each array framework
        for(int i = 0; i < framework.length; i++) {
            System.out.printf("Bahasa: %s\n", framework[i][0]);
            System.out.printf("Framework: %s\n", framework[i][1]);
            System.out.println("-----------------------");
        }
    }
}
