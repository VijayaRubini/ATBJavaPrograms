package ex_20042024;

public class lab058 {
    public static void main(String[] args) {
        String name1="Hello";
        String name2=" Guys";
        String name3="Hello Guys";

        String name4=name1.concat(name2);
        System.out.println(name4);
        //Strings are immutable-
        //Strings cannot be be changed multiple times as they create more memory for each function.
        //use Stringbuilder for  name change;

    }
}
