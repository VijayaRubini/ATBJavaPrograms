package April2024.ex_11042024.ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        int a=10;
        int b=45;
        System.out.println(a+b);
        String name="Krishna";
        System.out.println(a+name);//left to right 10Krishna
        System.out.println(name+a);//Krishna10
        System.out.println(a+b+name);//55Krishna
        //concatenation of strings
        System.out.println(name+a+b);//Krishna1045
        System.out.println();

    }
}
