package May2024.ex_11052024;

public class lab162 {
//procedural programming- functionalities

    //object oriented- attributes and behaviours

    public static void main(String[] args) {

        System.out.println("Hello");
        Person personref=new Person(); // Person class is loaded  after creating an object
        //memory allocated for object and not while creating class
        //Person-class , personref- reference, new-  new memory created in object Area
        //Person()- object- Attributes and behaviours are created in the memory in OA.

        personref.name="Amit";
        System.out.println(personref.name);

        Person vijaya=new Person(); //obj created
        Person kanika=null; // ref is created but not objt
        System.out.println(kanika);

        //Classname objref =object()  (new classname())

    }

}
