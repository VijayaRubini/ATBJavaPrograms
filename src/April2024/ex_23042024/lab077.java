package April2024.ex_23042024;
import java.util.Scanner;

public class lab077 {
    public static void main(String[] args) {
        // Grade calculator

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's marks  " );
        int score =sc.nextInt();
        char grade ='F';

        if(score>=90 && score<=100)
        {
            grade = 'A';
        }
        else if (score<=89 && score>=80) {
            grade = 'B';

        } else if (score<=79 && score>=70) {
            grade = 'C';
        } else if (score<=69 && score>=60) {
            grade = 'D';

          } else if (score<=59 && score>=50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your grade is   "+grade);
        sc.close();

    }
}
