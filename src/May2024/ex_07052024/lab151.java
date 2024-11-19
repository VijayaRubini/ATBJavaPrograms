package May2024.ex_07052024;

public class lab151 {
    public static void main(String[] args) {
       //Methods with parameters
        System.out.println(sumOfTwo(5,2));
        int r1= sumOfTwo(1,9);
        System.out.println(r1);
        int r2= sumOfTwo(90,34);
        System.out.println(r2);
        String r3=sumOfTwo("Viji",5);
        System.out.println(r3);

    }

    static String sumOfTwo(String a, int b) {
        return a+b;
    }

    static int sumOfTwo(int a,int b){
        return a+b;
    }
}
