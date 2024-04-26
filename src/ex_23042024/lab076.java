package ex_23042024;
import java.util.Scanner;

public class lab076 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();

        if(num1>20)
        {
            System.out.println("Number is >20");
        } else if ( num1>10) {
            System.out.println("Number is between 10 and 20");
        }

        else
            System.out.println("Number is <10");

        sc.close();


    }
}
