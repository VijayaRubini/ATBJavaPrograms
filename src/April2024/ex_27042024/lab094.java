package April2024.ex_27042024;

import java.util.Scanner;

public class lab094 {
    public static void main(String[] args) {
        //number is positive, negative or zero
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        if(num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("Negative Number");

        }
        else
            System.out.println("Zero");
        sc.close();

    }

}
