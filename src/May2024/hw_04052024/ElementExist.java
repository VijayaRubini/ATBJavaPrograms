package May2024.hw_04052024;

import java.util.Scanner;

public class ElementExist {
    public static void main(String[] args) {

        //Write a Java method to check if a given element exists in a 2D array. ( element =8) , true

        int[][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is exist in the array");
        int num=sc.nextInt();
        int check=0;

        for (int i = 0; i <array.length ; i++) {
            for(int j=0;j< array.length;j++){
                if(num==array[i][j])
                {
                    System.out.println("The given num "+num+" is exist in the array");

                }
                check++;
            }

        }


        sc.close();
    }
}
