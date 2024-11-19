package May2024.ex_04052024;

public class lab139 {
    public static void main(String[] args) {
        //print  2d array - 3 rows, 2 columns

        int[][] array_2d={
                {10,12},
                {34,45},
                {23,12}
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
