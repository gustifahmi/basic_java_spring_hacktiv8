import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        //Inisiasi nilai dan grade
        int nilai;
        String grade;

        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Terima input dan assign ke nilai
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();

        //Hitung grade
        if(nilai >= 90) {
            grade = "A";
        } else if(nilai >= 80) {
            grade = "B+";
        } else if(nilai >= 70) {
            grade = "B";
        } else if(nilai >= 60) {
            grade = "C+";
        } else if(nilai >= 50) {
            grade = "C";
        } else if(nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        //Print grade
        System.out.printf("Grade: %s\n", grade);
    }
}
