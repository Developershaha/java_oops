package ReferrenceSorting.CollectionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListClassProblem {
    public static void main(String[] args) {
        // define three element of array list

        List<Integer> number=new ArrayList<>(Arrays.asList(10,20,30));

        System.out.println(number.size());
        System.out.println(number.add(40)); // we will get boolean value after operation


        Iterator<Integer> itr= number.iterator();
        Integer target=40;
        while(itr.hasNext()){
            System.out.println(itr.next());
            if(target==itr.next()){
                number.set(3,50); // replace this with the index and new value which we want to update
                System.out.println("elememtn fount in the array list");
            }
        }
        System.out.println(number);
         number.clear();
        for(Integer num:number){
//            System.out.println(num);
            if(num==30){
                number.remove(2);
            }
        }
        System.out.println(number);

    }
}
