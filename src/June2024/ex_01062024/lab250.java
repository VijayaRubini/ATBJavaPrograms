package June2024.ex_01062024;

import java.util.Set;
import   java.util.HashSet;

public class lab250 {
    public static void main(String[] args) {


        //List of Webelements  -  Remove  duplicate
        // Set elements = new HastSet(); elements.add(e1); remove duplicate from the list

        //Given an array of integers, return an array of unique elements
        //i/p-  [1,2,3,4,5,6,7,8,9,4,5,5,6,3]
        //o/p- [1,2,3,4,5,6,7,8,9]

        int[] input = {1, 2, 2, 3, 3, 4, 5};
        // int[] output =new int[ input.length];
        // int  outputIndex=0;
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : input) {
            uniqueSet.add(num);
        }
        System.out.println(uniqueSet);


    }
}