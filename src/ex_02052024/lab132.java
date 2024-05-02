package ex_02052024;

import java.util.Scanner;

public class lab132 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] marks= new float[5];
        System.out.println("Enter sub1 marks");
        marks[0]=sc.nextFloat();
        System.out.println("Enter sub2 marks");
        marks[1]=sc.nextFloat();
        System.out.println("Enter sub3 marks");
        marks[2]=sc.nextFloat();
        System.out.println("Enter sub4 marks");
        marks[3]=sc.nextFloat();
        System.out.println("Enter sub5 marks");
        marks[4]=sc.nextFloat();

        for (int i = 0; i <marks.length; i++) {
            if(marks[i]<40) {
                System.out.println("You are fail");
            }
            System.out.println(marks[i]);

        }

        System.out.println("********Using While Loop****************");
        int j=0;
        while(j<marks.length)
        {
            System.out.println(marks[j]);
            j++;

        }

        sc.close();

    }
}
