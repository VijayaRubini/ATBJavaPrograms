package ex_02052024;

public class lab127 {
    public static void main(String[] args) {
        // == -> checks for reference
        //.equals() ->checks for  values or contents.

        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        System.out.println(arr1==arr2); //false bcoz diff reference is created

        System.out.println(arr1);
        System.out.println(arr2);

        int[] arr3=arr1;
        System.out.println(arr1==arr3); //true  - == nd equals() both are same. both check reference in Array
        System.out.println(arr1.equals(arr2)); //false - compares the reference of the array
        //equals in array is a class
        System.out.println(arr1.equals(arr3)); //true

        String s1="Vijaya";
        String s2="Vijaya";
        System.out.println(s1.equals(s2)); //true -  compares the value of string
        //equals in string is a string function
    }
}
