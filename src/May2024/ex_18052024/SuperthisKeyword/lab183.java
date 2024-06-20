package May2024.ex_18052024.SuperthisKeyword;

public class lab183 {
    public static void main(String[] args) {
       Student1 sc1= new Student1();

       // If child has DC, then Parent DC is called by Super() keyword automatically
        //super variable;
        //super method();
        //super.method();
        //super() -DC
        //super("viji") - PC

    }
}

class Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }
    Person1(String a)
    {
        System.out.println("Person1- PC");
    }
    Person1(String a,int a1){
        System.out.println("Person1- PC with 2 Parameters"); // PC- Parameterized constructor
    }

}
class Student1 extends Person1{
    Student1(){
       // super(); //- by default created and call the parent constructor
        //super("Viji");
        //super("viji", 30);
        System.out.println("Student1 - DC");
    }
}

