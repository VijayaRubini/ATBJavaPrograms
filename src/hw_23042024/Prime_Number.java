package hw_23042024;

import javax.swing.*;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if((num>1) && (num/2 ==1))
        {
            System.out.println(num +" is a prime number  ");
        } else if (((num>1) &&(num%2==0))||((num>1)&&(num%3==0))){
            System.out.println(num + "  is not a prime number");

        }else{
            System.out.println(num +" is a prime number");
        }

    }
}
