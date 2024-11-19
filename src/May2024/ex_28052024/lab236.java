package May2024.ex_28052024;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class lab236 {
    public static void main(String[] args) {

        ArrayList myList=  new ArrayList();//CR-CO // NO  thread safety -  concrete class
        myList.add("Pramod");
        myList.add("Anusha");
        myList.add("Kiran");
        System.out.println(myList);

        List  myList1   =  new ArrayList(); // FR-  CO

        Vector  v= new Vector();//Threaad Safety-  process slow  - legacy class
        v.add("Pramod");
        v.add("Anusha");
        v.add("Kiran");
        System.out.println(v);
        v.remove("Kiran");
        System.out.println(v);




    }
}
