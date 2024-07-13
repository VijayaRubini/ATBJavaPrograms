package May2024.ex_25052024.Exceptions;

public class lab223 {
    public static void main(String[] args) {
        try{

            int a=0;
            int c=10/a;

        }catch (Exception e){
            System.out.println("Exit");
            System.out.println(e.getMessage());

        }finally {
            System.out.println("I am final");
        }


    }
}
