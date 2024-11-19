package May2024.ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class lab238 {
    public static void main(String[] args) {

        //List -  ArrayList, LinkedList, vector, Stack
        //Set  - HashSet,  LinkedHashset,  treeSet
        //Map - HashMap,  linkedHashmap,  Treemap
        //Queue- PriorityQueue, LinkedList,
        //Hashtable, Properties

        List<String>  courseList  = new ArrayList();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET  Blueprint");

        List numList=new ArrayList();
        numList.add(233);
        numList.add(120);
        numList.add(100);
        numList.add(250);
        numList.add(125);

        courseList.addAll(numList);
        System.out.println(courseList);
        System.out.println(numList);


    }


}
