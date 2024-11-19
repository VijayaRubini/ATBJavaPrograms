package May2024.ex_25052024.Exceptions;

public class lab222 {
    public static void main(String[] args) {
        try {
            String s1 = "Vijaya";
            int a=10/0;
            String a1=args[0];
            s1 = null;
            System.out.println(s1.trim());
        }catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }

        System.out.println("End of program");
    }
}
