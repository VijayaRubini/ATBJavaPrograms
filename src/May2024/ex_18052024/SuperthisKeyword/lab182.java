package May2024.ex_18052024.SuperthisKeyword;

public class lab182 {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.message();
        s1.display();


    }
}
class Student extends Person{

    void message(){ // is A, single Inheritance
        System.out.println("I am Student message");
    }
    void display(){
        this.message();
        super.message();

    }
}
class Person{
    void message(){
        System.out.println("I am Person  message");
    }
}
