package May2024.ex_16052024.SingleInheritance;

public class Programming {

    // Attributes - Instance variables
    int version;
    String author;

    Programming() {
        System.out.println("Default Constructor");
    }

    Programming(int version, String author) {
        this.version = version;
        this.author = author;
        System.out.println("Parameterized Constructor");
    }
    void printInfo(){

        System.out.println("Program info -> "+this.version+ "  Author -> "+this.author);
    }

    void bhk3(){
        System.out.println("3BHK");
    }
}
