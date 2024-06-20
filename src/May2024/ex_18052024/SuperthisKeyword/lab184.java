package May2024.ex_18052024.SuperthisKeyword;

public class lab184 {
    public static void main(String[] args) {
       // Animal a1= new Animal("small");

        Dog d1=new Dog(); // o/p -Dog DC, ANimal -DC  both will b

        System.out.println("");
        //Constructor Chaining - child -DC thn Parent DC also called
        Dog d2= new Dog("Labrador");
        d2.display();
        System.out.println("");

        Dog d3= new Dog("Labrador", "Golden Retriever");
        d3.display();

    }

}
class Animal {
    String type;

    Animal(){
        System.out.println("Animal DC");
    }

    Animal(String type){
        this.type=type;
        System.out.println("Animal PC ");
    }
}

class Dog extends Animal{
    String breed;

    Dog(){
    super();
    System.out.println("Dog DC");
    }

    Dog(String breed) {
       super("Dog type");
        this.breed = breed;

    }
    Dog(String breed, String type){
        //super(type);
        // super("Dog Type");
        this("Breed set by Dog only");
        this.breed= breed;
        //this.type=type;
        System.out.println("PC with 2 args");

    }

    void display(){

       // System.out.println("Type :  "+super.type+", Breed :  "+this.breed);
        System.out.println("Type : "+type+", Breed : "+breed);


    }

}
