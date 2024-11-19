package June2024.ex_01062024;

import java.util.Set;
import java.util.TreeSet;

public class lab248 {
    public static void main(String[] args) {

        TreeSet numSet = new TreeSet(); // Store the elements in the sorted order
        numSet.add(567);
        numSet.add(322);
        numSet.add(879);
        numSet.add(567);
        numSet.add(945);
        //numSet.add("hgjhgj"); classcast exception
        // cannot sort different data types
        System.out.println(numSet);

    }
}
