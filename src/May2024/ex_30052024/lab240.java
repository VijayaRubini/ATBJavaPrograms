package May2024.ex_30052024;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class lab240 {
    public static void main(String[] args) {

        List ttaCourseList =  new LinkedList();
        ttaCourseList.add("ATB");
        ttaCourseList.add("MTB");
        ttaCourseList.add("PyATB");
        ttaCourseList.add("SDET  Blueprint");
        ttaCourseList.add("LAPIT");
        ttaCourseList.add("Java");

        System.out.println(ttaCourseList);

        Vector<String > v2  =  new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("PyATB");
        v2.add("SDET  Blueprint");
        v2.add("LAPIT");
        v2.add("Java");

        Enumeration e = v2.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
