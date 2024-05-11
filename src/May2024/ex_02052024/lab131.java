package May2024.ex_02052024;

public class lab131 {
    public static void main(String[] args) {
      //  System.out.println(args[0]); exception error will occur. no values are assigned  also null wont occur,
        //it will be default only while using new operator

        String[] name=new String[5];
        System.out.println(name[0]); //null
        System.out.println(name[4]);//null

        System.out.println(args[0]); // values are edited for args main() string function. ... edit, prefer values
        System.out.println(args[1]);
    }
}
