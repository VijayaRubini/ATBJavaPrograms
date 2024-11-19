package May2024.ex_16052024.MultilevelInheritance;

public class lab176 {
    public static void main(String[] args) {

        GrandFather grandfather = new GrandFather();
        grandfather.home();

        Father father = new Father();
        father.home();

        Child child =new Child();
        child.home();

        //Dynamic Dispatch

        GrandFather gf1=new GrandFather();
        GrandFather gf2= new Father();
        GrandFather gf3= new Child();
        gf1.home();
        gf2.home();
        gf3.home();


        Father f1= new Child();
        f1.home();

        // the below obj  and ref is not possible
        //Father f1= new GrandFather();
        //Child c1= new GrandFather();
        //Child c2= new Father();



    }

}
