package May2024.ex_02052024;

public class lab133 {
    public static void main(String[] args) {
        //fizzbuzz

        for (int i = 1; i <=100 ; i++) {

            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");

            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);

        }
    }
}
