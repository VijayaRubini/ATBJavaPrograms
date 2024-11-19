package May2024.ex_04052024;

public class lab137 {
    public static void main(String[] args) {
        //1d array
        int[] array_1d={12,34,67};

        //2d array
        /*
        Matrix- rows and columns

        int[][] array_2d={
                {10,12,15},
                {34,45,67},
                {23,12,11}
         };
        int[][] array_2d_2=new int[3][3];
       // {0,0,0}
        //{0,0,0}
        //{0,0,0}

        array_2d_2[0][0]=10;
        //{10,0,0}
        array_2d_2[0][1]=12;
        array_2d_2[2][2]=11;
         */

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
