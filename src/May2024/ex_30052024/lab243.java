package May2024.ex_30052024;

import java.util.Stack;

public class lab243 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // Stack  -  First In Last Out
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.add("D");


        System.out.println(stack);
       // System.out.println(stack.pop());//  remove  the top  most from the  stack
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);





    }
}
