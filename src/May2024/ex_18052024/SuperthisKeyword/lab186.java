package May2024.ex_18052024.SuperthisKeyword;

public class lab186 {
    public static void main(String[] args)  {

        P p1=new P();
        p1.m2();
    }

}

class P{

    void m1(){
        System.out.println("M1");
    }

    void m2(){
        m1();
        System.out.println("M2");

    }
}