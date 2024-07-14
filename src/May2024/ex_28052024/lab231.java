package May2024.ex_28052024;

import java.util.List;

public class lab231 {
    public static void main(String[] args) {


    /*
    Shopping  list
    Milk,bread,  butter, cheese
    4 elements
    Collection Framework - how u store the elements
    1.List(Interface)-Array list,Linked list,Vector,Stack
     */

        List shopping_list = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());  //  length of the list
        System.out.println();

        List fruits  =  List.of("Mango","Banana","Apple","WaterMelon","Grapes","Orange","Apple");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println();

        List my_10th_marks =  List.of(91,92,95,98,96);
        System.out.println(my_10th_marks);
        System.out.println(my_10th_marks.size());
        System.out.println();

        List  different_data_type = List.of("Vijaya", true, 32);
        System.out.println(different_data_type);
        System.out.println(different_data_type.size());
        System.out.println();

        System.out.println(fruits.get(0));
        System.out.println(fruits.indexOf("Apple"));
        System.out.println(fruits.isEmpty());

        //add,remove,clear,contains, isEmpty, size,indexOf,get
        //addAll,removeAll,containsAll,retainAll
        //

        //Cannot add element to the list using add function
        //fruits.add("pineapple");  is not possible



    }
}
