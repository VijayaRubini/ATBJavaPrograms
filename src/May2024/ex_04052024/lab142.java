package May2024.ex_04052024;

public class lab142 {
    public static void main(String[] args) {
        int[][] array={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int max_array= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length;j++){
                if(array[i][j] > max_array ) {
                max_array = array[i][j];
            }

        }
}

        System.out.println(max_array);

    }

}
