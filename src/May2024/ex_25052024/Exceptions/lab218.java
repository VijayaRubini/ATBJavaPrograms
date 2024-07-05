package May2024.ex_25052024.Exceptions;

public class lab218 {
    public static void main(String[] args) {
        //Exception handling - program vl not get terminated
        // terminates the flow when error occurs if exception is not handled

       // String s1=null;
       // s1.trim();
        //NullPointerException is thrown, bcoz null cannot be trimmed off.

        int a=10;
        int c=a/0;
        System.out.println(c);
        //ArithmeticException
    }
}
