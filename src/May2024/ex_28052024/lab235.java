package May2024.ex_28052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class lab235 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(); // CR -  CO
        List  myList1= new ArrayList() ; //FR-  CO
        SequencedCollection myList2 =new ArrayList();//GR- CO
        Collection myList3=new ArrayList();// GGFR- CO


        /*  ArrayList
        *   Size is Dynamic
        * Duplicate  is Allowed
        * Insertion order is preserved
        * Heterogeneous  objects are allowed
        * Null  insertion is possible
         */

        myList.add("Pramod");
        myList.add("Anusha");
        myList.add("Dutta");
        System.out.println(myList);

        myList.add("Pramod");
        myList.add("null");
        myList.add("Pramod");
        System.out.println(myList.size());

        myList.remove("Pramod");
        System.out.println(myList);
        System.out.println(myList.size());




    }
}
