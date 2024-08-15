package June2024.ex_01062024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class lab251 {
    public static void main(String[] args) {

        //Queue
        Queue pq1 = new PriorityQueue();
        //FIFO

        pq1.add("B");
        pq1.add("A");
        pq1.add("C");
        pq1.add("C");
        pq1.offer("D"); //Add
        //pq1.offer(null); //Null is not supported
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);

        Iterator iterator = pq1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


        System.out.println(pq1);
    }


    }

