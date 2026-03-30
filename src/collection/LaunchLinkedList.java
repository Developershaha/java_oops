package collection;

import java.util.LinkedList;

public class LaunchLinkedList {

    public static void main(String[] args) {
        LinkedList li=new LinkedList();

        li.add("shahaji");
        li.add(100);
//        li.addFirst(1);
        li.addLast(0);
        System.out.println(li.contains(100));
        System.out.println(li); // we are just printing linkedlist not iterating oky
        li.offer("junit");
        li.addFirst(-1);
        li.offerLast(-9);
        li.peek();// just copy first index and priting
//        li.poll(); // remove first element from the list

        System.out.println(li);
    }
}
