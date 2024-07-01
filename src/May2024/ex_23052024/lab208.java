package May2024.ex_23052024;

public class lab208 {
    public static void main(String[] args) {

        //Anonymous class

        ABC abc = new ABC(){
            void m1(){
                System.out.println("M1");
            }
        } ;
        abc.m1();

        I1 i1=new I1(){
            void m2(){
                System.out.println("M2");
            }
        };
        i1.m2();
    }
}
class anonymous extends ABC{
    void m1(){

    }
}

abstract class ABC{

   abstract void m1();

}

interface I1{
    void m2();
}

