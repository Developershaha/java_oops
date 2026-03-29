package collection;

import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(100);
        al.add(true);
        al.add("shahaji");
        // we can add any type of data in the linkedlist

        System.out.println(al);
        // add at specific index this is posible to add any where in the index but this is not feciable so avoid to add at the start and anywhere in the arraylist or list


        al.add(0,1);
        System.out.println(al); // this is posible but avoid this


    }
}
