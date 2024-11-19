package May2024.ex_14052024;

public class ATBPerson {

    //variables
    //Local variables
    String name; //instance variable
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    //Constructor - doesnot return anything
    // it is called , when object is created
    //It has same name as the class name
    // it is a special method with no return type

    ATBPerson(){//default constructor
        //System.out.println("Hello!, I will be called when you create an object of class");
        System.out.println("Default Constructor");
        courseName="ATB";
    }

    //parameterized constructor
    ATBPerson( String givenName) {
        System.out.println("Parameterized Constructor");
        this.name = givenName;
        phone = 9876543210l; //phone num hard coded.
        // phone num for all would be same.
    }

    ATBPerson( String givenName, long phoneno) {
        System.out.println("Parameterized Constructor");
        this.name = givenName;
        this.phone= phoneno;
    }
    //constructor by using generate option
    ATBPerson(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }


    void ATBPerson(){

        System.out.println("Normal Method / Function");
    }

    void printDetails(){

        System.out.println("Printing details of the student");
    }




}
