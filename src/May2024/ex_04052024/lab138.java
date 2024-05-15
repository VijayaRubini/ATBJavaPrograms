package May2024.ex_04052024;

public class lab138 {
    public static void main(String[] args) {

        //print  2d array

        int[][] array_2d={
                {10,12,15},
                {34,45,67},
                {23,12,11}
        };
        for (int i = 0; i < array_2d.length ; i++) {
            for(int j=0;j< array_2d[i].length;j++){
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }



    }
}
