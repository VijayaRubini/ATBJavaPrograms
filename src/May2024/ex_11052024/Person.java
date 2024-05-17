package May2024.ex_11052024;

public class Person {
    //Attributes
    String name;
    byte age;
    long phn_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eye_colour;

    //Behaviours

    void walk(){
        System.out.println("I can walk");
    }

    void talk(String msg){
        System.out.println("I will say  "+msg);
    }
    String sleep(){
        return "Sleeping";
    }

    String eat(String item){
        return item;
    }
}
