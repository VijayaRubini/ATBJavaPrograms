package May2024.ex_30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lab239 {
    public static void main(String[] args) {

        List ttaCourse =new ArrayList();
        ttaCourse.add("ATB");
        ttaCourse.add("MTB");
        ttaCourse.add("PyATB");
        ttaCourse.add("SDET  Blueprint");
        ttaCourse.add("LAPIT");
        ttaCourse.add("Java");

        Iterator iterator = ttaCourse.iterator();
        while(iterator.hasNext()){
            Object obj =  iterator.next();
            if(obj  instanceof String)
            {
                System.out.println(obj);
            }
            else{
                System.out.println("Not a String");
            }

        }

        for(Object course : ttaCourse){
            System.out.println(course);
        }

        for (int i = 0; i < ttaCourse.size(); i++) {
            System.out.println(ttaCourse.get(i));
        }


        //List-  ArrayList, LinkedList
        ListIterator lt = ttaCourse.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }

        System.out.println("__________-----------__________");

        ListIterator  lt2= ttaCourse.listIterator(ttaCourse.size());
        while ((lt2.hasPrevious())){


          //  System.out.println(lt2.hasPrevious());
        }

        System.out.println(ttaCourse);


    }
}
