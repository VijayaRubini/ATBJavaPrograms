package May2024.ex_07052024;

public class lab153 {
    public static void main(String[] args) {
        //non return with no parameter
        saySomething();
        //non return with parameter
        saySomething("Vijaya");
        //return with no parameter
        sumOfTwoBad(3,4);
        //return with parameter
        int result= sumOfTwoGood(8,9);
        System.out.println(result);


    }

    static int sumOfTwoGood(int a, int b) {
        return a+b;
    }

    static void sumOfTwoBad(int a, int b) {
        System.out.println(a+b);
    }

    static void saySomething(String name) {
        System.out.println("Hello  "+name);
    }

    static void saySomething() {
        System.out.println("Hello");
    }
}
