package May2024.ex_23052024;

public class lab203 {
    public static void main(String[] args) {


        Person p1 = new Person("Amit");
        Person p2 = new Person("Manoj");

        System.out.println(Person.footBallClub);
        //static function is called vt classname. func
        Person.m1();

        p1.m1();
        // non static members
        p1.m2();
        p2.m2();

        Person.footBallClub="ManU";
        System.out.println(p1.footBallClub);
        System.out.println(p2.footBallClub);

        p1.name="Kani";
        System.out.println(p2.name);
        System.out.println(p1.name);



    }
}
class Person{
static String footBallClub="Arsenal";

static{
    System.out.println("Once, when class is loaded");
}
    {
        System.out.println("IIB");
    }
    // static fn - common
    static void m1(){
        System.out.println("I am a common F(n)");
       // System.out.println("I am a common function"+this.name); static member cannot access non static variable
        // as static function is executed when class is loaded. so variables are not created as object is not created.

    }
    //non static fn
    void m2(){
        System.out.println("Person ->  "+this.name);
        System.out.println(footBallClub);// non static member can access static variable
        //as object is created  , class is already loaded. so, variable can access static variable.
    }

    String name;
    public Person(String name){
        this.name=name;
    }
}