package April2024.ex_23042024;

import java.util.Scanner;

public class lab075 {
    public static void main(String[] args) {
        // max between 2 num

        System.out.println("Enter Number 1");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();

        System.out.println("Enter Number 2");
        int num2=sc.nextInt();

        int max = Math.max(num1,num2);
        System.out.println("Maximum num is  "+max);

        if(num1>num2)
        {
            System.out.println("Maximum is   "+num1);
        }
        else
            System.out.println("Maximum is  "+num2);

        sc.close();

    }
}
