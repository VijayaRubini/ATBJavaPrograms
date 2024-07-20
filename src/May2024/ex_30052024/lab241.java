package May2024.ex_30052024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab241 {
    public static void main(String[] args) {

        //What kind  of  error it  is?  - Compile  error  orn Runtime error.
        // Run time - Nullpointer Exception

        //List stringList  =   null;
        //stringList.add("Doctor");

        List  marks =  new ArrayList<>();
        marks.add(89);
        marks.add(99);
        marks.add(80);
        marks.add(55);
        marks.add(97);
        Collections.sort(marks); // Collections  framework-  Concrete class
        System.out.println(marks);



    }
}
