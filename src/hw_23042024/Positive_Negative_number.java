package hw_23042024;
import java.util.Scanner;

public class Positive_Negative_number {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        if(num>0)
        {
            System.out.println("Number is Positive");
        } else if (num<0) {
            System.out.println("Number is Negative");

        }
        else
            System.out.println("Number is zero");

        sc.close();

    }

}
