package May2024.ex_14052024;

public class Person {

    String name;
    int age;
    //Parameterized constructor
    Person(String name, int age){
        this.name=name;
        this.age=age;

    }

    //copy constructor
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
    }

    public static void main(String[] args) {
        Person perRef= new Person("John", 28);
        System.out.println(perRef.name +" is "+ perRef.age+" years old");
        System.out.println("*************************\n");
        System.out.println("Copy Constructor");
        Person perRef2= new Person(perRef);
        System.out.println(perRef2.name +" is "+ perRef2.age+" years old");




    }
}
