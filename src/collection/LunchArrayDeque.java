package collection;

import java.util.ArrayDeque;

public class LunchArrayDeque {
    public static void main(String[] args) {
        ArrayDeque aq=new ArrayDeque();
        aq.add(100);
        aq.add(50);
        aq.addFirst(1);
        aq.addLast(9);

        System.out.println(aq);

    }
}
