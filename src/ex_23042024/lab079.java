package ex_23042024;
import java.util.Scanner;

public class lab079 {
    public static void main(String[] args) {
        //triangle classifier
        //3 sides of a triangle
        // equilateral- 3 sides equal
        //isoceles- 2 sides equal
        // scalene- no sides are equal
        //use if-else statement

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values for side1, side 2 and side3 of a triangle");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();

        if(side1==side2 && side2==side3 && side1==side3) {
            System.out.println("It is an equilateral triangle");
        } else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("It is an isoceles triangle");
        }
        else {
            System.out.println("It is a Scalene triangle");
        }

        sc.close();

    }
}
