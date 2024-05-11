package May2024.ex_04052024;

public class lab136 {
    public static void main(String[] args) {
    //store value and double the value
        int[] arrays={30,40,50};
        int[] arrays2=new int[3];

        for (int i = 0; i <arrays.length ; i++) {

            arrays2[i]=arrays[i]*2;
        }

        System.out.println("Printing Arrays!!");
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays2[i]);
        }


    }
}
