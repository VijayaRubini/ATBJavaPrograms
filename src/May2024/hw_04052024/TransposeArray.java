package May2024.hw_04052024;

public class TransposeArray {
    public static void main(String[] args) {
        // Write a Java method to transpose a given 2D array.
        /*
        1  4  7
        2  5  8
        3  6  9
         */

        int[][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]);
                System.out.print('\t');
            }
            System.out.println('\n');
        }

    }
}
