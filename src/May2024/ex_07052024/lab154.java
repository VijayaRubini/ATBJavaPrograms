package May2024.ex_07052024;

import java.util.Scanner;

public class lab154 {
    public static void main(String[] args) {
        //calculator functions
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();

        int r_sum=sum(num1,num2);
        int r_sum2=sum(7,5);
        int r_sub=sub(num1,num2);
        int r_mul=mul(num1,num2);

        System.out.println("Sum is -> "+r_sum);
        System.out.println("Sum is -> "+r_sum2);
        System.out.println("Difference  is -> "+r_sub);
        System.out.println("Product is -> "+r_mul);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
}
