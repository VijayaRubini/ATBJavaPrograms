package May2024.hw_04052024;

public class maxVal {
    public static void main(String[] args) {
        //To find max value in an array
        int[][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j< array.length;j++){
                if(array[i][j]>max)
                {
                    max=array[i][j];
                }
            }

        }

        System.out.println("Maximum value in the array is  "+max);



    }
}
