package ex_25042024;
import java.util.Scanner;

public class lab080 {
    public static void main(String[] args) {
        //Switch statement
        //days in the week
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number from 1-7, will tell the days of the week");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid number 1-7 only" );

        }

        sc.close();

    }
}
