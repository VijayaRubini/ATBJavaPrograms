package May2024.ex_21052024.Abstraction;

public class lab200 {

}

class A1 extends B1{

    public void mtb(){
        System.out.println("MTB Completed");
    }

    public void atb(){
        System.out.println("ATB Completed");
    }
}

abstract class B1 implements Course{
abstract void mtb();
/**
    @Override
    public void atb() {
        System.out.println("ATB Completed");
    }
**/
}

interface Course{
    void atb();
}
