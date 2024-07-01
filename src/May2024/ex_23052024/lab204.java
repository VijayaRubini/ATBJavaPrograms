package May2024.ex_23052024;

public class lab204 {
    public static void main(String[] args) {
        A aRef=new A(); // o/p- A
      //  A b=null; // o/p- nothing, as class is not loaded completely.
        A b=new A();
        A c=null;
        System.out.println(A.common);
        System.out.println(aRef.common);
        System.out.println(b.common);
        A.m1();
        aRef.m1();
        b.m1();



    }
}

class A{
    int age=10;
    static String common="ABC";
    static{
        System.out.println("SIB-A");
    }

    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("M1");
    }

    void m2(){
        System.out.println("M2");
    }
}
