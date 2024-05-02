package ex_02052024;

public class lab126 {
    public static void main(String[] args) {

        final int[]a=new int[5]; //final only for the size nd not for the values
        //default value- a- [0,0,0,0,0]

        a[0]=10;
        a[1]=80;
        a[1]=54;
        a[1]=32;
        System.out.println(a); // reference for ' a ' will be displayed
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        final int abc=10;
        // abc=46; error. it wont execute
        //final  for primitive data type- byte, short, int,long,float,double
        //works as it is the final value

        //final keyword
        // non primitive data type- strings, arrays,
        // // Arrays- the values can be changed but the size is fixed



    }
}
