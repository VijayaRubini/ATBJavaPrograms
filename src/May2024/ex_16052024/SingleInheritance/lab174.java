package May2024.ex_16052024.SingleInheritance;

public class lab174 {
    public static void main(String[] args) {
        
        //Inheritance
        //Inherit Attribute and Behaviour from parents and grand parents

        //Parent Class/Super class/ Base class
        //Child class / Sub class /Derived class

        //Parent -child
        //child extends parent{}
        //extend keyword- parent's attributes and behaviours are available to the child's class

        // Programming- parent class
        //java- child class

        Programming p= new Programming(12, "KO");
        Java j=new Java("lambda");
        p.printInfo();
        j.printInfo();

        Programming p1= new Programming(12, "Van Russen");
        p.printInfo();

        Python python = new Python();
        python.bhk3();
        python.printInfo();

    }
}
