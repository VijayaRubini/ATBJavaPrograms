package April2024.ex_27042024;

import java.util.Scanner;

public class lab120 {
    public static void main(String[] args) {
        //factorial program
        //1!= 1*1=1
        //2!= 2*1=2
        //3!= 3*2*1=6
        //5!=5*4*3*2*1 =120

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for which Factorial needs to be find");
        int num=sc.nextInt();
        long fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }

        System.out.println("Factorial of  "+num +" is -> "+fact);

        sc.close();
    }
}
