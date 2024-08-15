package June2024.ex_01062024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab246 {
    public static void main(String[] args) {

        Set<String> courseSet =new HashSet<>();
        courseSet.add("ATB");
        courseSet.add("MTB");
        courseSet.add("LAPIT");
        courseSet.add("SDET Blueprint");
        courseSet.add("Java for Testers");
        System.out.println(courseSet);

        System.out.println("Using  foreach  loop");
        for(Object  o : courseSet){
            System.out.println(o);
        }
        System.out.println("Using   Iterator");

        Iterator it = courseSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
