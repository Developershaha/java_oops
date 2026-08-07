package ReferrenceSorting.CollectionProblem;

import CoreJava.Interface.Interface1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// reverse this list don't use Collections.reverse() method oky
public class ReverArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40);

//        Collections.reverse(list); - i have used two pointer method to solve this method
        Integer start=0;
        Integer end=list.size()-1;

        while(start<end){
            // write swap logic here oky
            Integer temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        System.out.println(list);




    }
}
