package May2024.ex_02052024;

public class lab128 {
    public static void main(String[] args) {
        // {} , [5]

        int[] a={2,3,4,5};
        int b[]={3,4,5,6}; // both r correct, can place the [] anywhere

        //how to print all the values
        //using for loop

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]); // a[0]=2, a[1]=3,a[2]=4,a[3]=5
            //2,3,4,5
        }

        for (int i = 1; i <a.length ; i++) {
            System.out.println(a[i]); //3,4,5
        }

    }
}
