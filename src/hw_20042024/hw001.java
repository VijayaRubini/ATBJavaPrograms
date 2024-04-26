package hw_20042024;

public class hw001 {
    public static void main(String[] args) {
        //Max between 3 Numbers with ?: operators.

        int a=20;
        int b=40;
        int c=30;

        int max= ((a>b)&&(a>c)) ? a : (b>c)?b :c;
        System.out.println("maximum of 3 num is "+ max);


    }

}
