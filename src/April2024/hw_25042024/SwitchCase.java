package April2024.hw_25042024;

import java.util.Scanner;

public class SwitchCase {
    public static  void main(String[] args) {
        //Program to Perform Arithmetic Operations

        //Take a input from user, input1, input2 as int and
        // ask the user what you want to do, enter char +,*,/ ,%, - ,
        // you will share the result by using the switch.

        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number");
        num1 =sc.nextInt();

        System.out.println("Enter the second number");
        num2 =sc.nextInt();


        System.out.println("Enter the arithmetic operation need to be performed : +,-,*,/,%");
        String sym;
        sym = sc.next();
        //String sym= sc.nextLine();
        switch (sym)
        {
            case "+"  :
                System.out.println(num1+num2);
                break;

            case "-" :
                System.out.println(num1-num2);
                break;
                case "*":
                    System.out.println(num1*num2);
                    break;
                    case "/" :
                        System.out.println(num1/num2);
                    break;

                    case "%" :
                        System.out.println(num1%num2);
                        break;

            default:
                System.out.println("Please enter the correct arithmetic operator");


        }

        sc.close();


    }
}
