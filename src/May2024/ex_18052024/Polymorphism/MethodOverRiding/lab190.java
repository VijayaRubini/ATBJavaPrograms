package May2024.ex_18052024.Polymorphism.MethodOverRiding;

public class lab190 {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();

        Hound d1= new Hound();
        d1.bark();

        Dog d2= new Hound(); // Dynamic dispatch - runtime polymorphism
        d2.bark();
    }
}
