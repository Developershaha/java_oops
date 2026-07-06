package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(89);
        list.add(9);

        Iterator<Integer> itr = list.iterator();
        System.out.println(list.contains(9));
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
