package April2024.hw_23042024;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check for leap year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("It is a leap year");
        }
        else System.out.println("It is not a leap year");

        sc.close();
    }
}

