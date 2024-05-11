package May2024.hw_02052024;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] marks= new float[5];
        System.out.println("Enter sub1 marks ");
        marks[0]=sc.nextFloat();
        System.out.println("Enter sub2 marks");
        marks[1]=sc.nextFloat();
        System.out.println("Enter sub3 marks");
        marks[2]=sc.nextFloat();
        System.out.println("Enter sub4 marks");
        marks[3]=sc.nextFloat();
        System.out.println("Enter sub5 marks");
        marks[4]=sc.nextFloat();

        System.out.println("*********Marks*********");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        sc.close();
    }
}
