package June2024.ex_01062024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab249 {
    public static void main(String[] args) {

        System.out.println("Hash Set");
        Set<Integer> integerSet = new HashSet();
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(123);
        integerSet.add(1234);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);
        System.out.println();

        System.out.println("Linked Hash Set- Maintain order");
        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(123);
        integerSet2.add(1234);
        integerSet2.add(12);
        integerSet2.add(null);
        System.out.println(integerSet2);
        System.out.println();

        System.out.println("Tree Set- Sort the elements");
        Set<Integer> integerSet3  = new TreeSet<>();
        integerSet3.add(45);
        integerSet3.add(23);
        integerSet3.add(2);
        integerSet3.add(98);
        integerSet3.add(60);
       // integerSet3.add(null); null - not  allowed in treeset

        System.out.println(integerSet3);

        System.out.println();
        Set integerSet4 = new TreeSet();
        integerSet4.add("Rubini");
        integerSet4.add("Vijaya");
        integerSet4.add("Anbu");
        integerSet4.add("Arun");
        integerSet4.add("Krishna");
        System.out.println(integerSet4);

    }
}
