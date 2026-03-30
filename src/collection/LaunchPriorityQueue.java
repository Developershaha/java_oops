package collection;

import java.util.PriorityQueue;

public class LaunchPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue(); // this data structure or collection follow min heap data structure
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(175);
        System.out.println(pq);

    }
}
