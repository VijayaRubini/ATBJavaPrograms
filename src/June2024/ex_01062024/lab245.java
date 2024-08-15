package June2024.ex_01062024;
import java.util.HashSet;
import  java.util.Set;

public class lab245 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("BANANA");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("BANANA"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        System.out.println(fruits);



    }
}
