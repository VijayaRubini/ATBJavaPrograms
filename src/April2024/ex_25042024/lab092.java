package April2024.ex_25042024;

import java.util.Scanner;

public class lab092 {
    public static void main(String[] args) {

        //calculate Grade/cgpa

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        marks = marks / 10;
        System.out.println(marks);

        switch (marks) {

            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;

            case 5, 4, 3, 2, 1:
                System.out.println("F");
                break;

            default:
                System.out.println("Enter valid marks");
        }

        sc.close();


    }
}
