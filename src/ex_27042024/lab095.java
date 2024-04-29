package ex_27042024;

import java.util.Scanner;

public class lab095 {
    public static void main(String[] args) {
        //largest among 3 number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1=sc.nextInt();
        System.out.println("Enter the Num2");
        int num2=sc.nextInt();
        System.out.println("Enter the Num3");
        int num3=sc.nextInt();
        System.out.println("Maximum among 3 numbers");
        if(num1>=num2 && num1>=num3) {
            System.out.println(num1);
        } else if (num2>=num1 && num2>=num3) {
            System.out.println(num2);

        }else
            System.out.println(num3);

        //Using ternary operator

        int large= (num1>num2) ? ((num1>num3) ? num1 : num3) : ((num2>num3) ? num2 : num3);
        System.out.println(large);



        sc.close();

    }
}
