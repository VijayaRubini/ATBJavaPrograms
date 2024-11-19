package May2024.ex_28052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab234 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList();

        nameList.add("Sham");
        nameList.add("Anusha");
        nameList.add("lily");
        nameList.add("ken");
        //nameList.add(67);
        System.out.println("------Print 1- for each------");
        for(String  str: nameList)
        {
            System.out.println(str);
        }
        System.out.println("----Print 2- for loop------");

        for(int i=0;i< nameList.size();i++)
        {
            System.out.println(nameList.get(i));
        }

        System.out.println("------Print 3 - Iterator-----");
        Iterator<String> itr= nameList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
