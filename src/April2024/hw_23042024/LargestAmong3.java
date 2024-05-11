package April2024.hw_23042024;
import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1, num2 and num3");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("Maximum is  "+num1);
        } else if (num2>num3) {
            System.out.println("Maximum is  "+num2);
        }
        else
            System.out.println("Maximum is   "+num3);

        sc.close();



    }
}
