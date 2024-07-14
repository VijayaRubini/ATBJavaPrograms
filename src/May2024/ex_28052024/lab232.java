package May2024.ex_28052024;

import java.util.ArrayList;
import java.util.List;

public class lab232 {
    public static void main(String[] args) {
        //List is an interface and ArrayList  is a class.
        // object for List is not allowed
        //object of class is possible


        List myList = new ArrayList();  //  Dynamic dispatch - runtime  polymorphism
        ArrayList  myList1=new ArrayList(); //  class, ref  and object
        // List myList2=new List();  not possible
        //add,remove,clear,contains, isEmpty, size,indexOf,get
        //addAll,removeAll,containsAll,retainAll

        myList.add("Vijaya");
        myList.add("Rubini");
        myList.add("Shan");
        myList.add("Usha");
        myList.add("Prem");
        myList.add("Kumari");
        myList.add("Pooja");
        myList.add("Shan");

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.indexOf("Shan"));

        myList.remove("Shan"); // remove the first occurence
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());

        myList.add("Vijaya");
        myList.add("Rubini");
        myList.add("Shan");
        myList.add("Usha");
        myList.add("Prem");
        myList.add("Shan");
        System.out.println(myList);
        myList.add("Anjana"); // add in the end
        myList.set(1,"Anbu");// replaces the object in  the gn index
        // ArrayList uses array only but uses 100 memory allocations.  once  rchd 99 then it  create 200

        myList.add(21343);
        myList.add(true);
        System.out.println(myList);
        System.out.println("--------Print using For Loop-----");
        //how to print - using for loop
        for(int i=0;i< myList.size();i++)
        {
            System.out.println(myList.get(i));

        }
        System.out.println("---------For Each loop--------");
        //using for  each loop
        for(Object obj:myList)
            System.out.println(obj);







    }
}
