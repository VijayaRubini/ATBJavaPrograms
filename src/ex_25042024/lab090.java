package ex_25042024;
import java.util.Scanner;

public class lab090 {
    public static void main(String[] args) {
        //cube root of(x^2 +y^2 -|Z|) absolute value of z
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of X");
        double x=sc.nextDouble();
        System.out.println("Enter the value of Y");
        double y=sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z=sc.nextDouble();

        double result;
        result=Math.cbrt((Math.pow(x,2))+(Math.pow(y,2))-(Math.abs(z)));
        System.out.println(result);

        sc.close();

    }
}
