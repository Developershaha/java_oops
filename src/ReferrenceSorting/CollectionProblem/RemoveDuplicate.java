package ReferrenceSorting.CollectionProblem;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    // remove duplicate element in the array or collection and also maintain order
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("shahaji","kokane","shahaji","kokane")); // total element is 7 and duplicate element is 2

        // we can solve this problem using many ways but solved fro hardcoded ways
        List<String> newList=new ArrayList<>();
        // using loop and contains method of collection oky
        for(String element:list){
//            System.out.println(element);
            if(!newList.contains(element)){
                newList.add(element);
            }
        }
        System.out.println(newList);
        // method 2 oky
        // using stream api's oky
//        List<Integer> newList=list.stream().distinct().toList();
//        System.out.println(newList);

        // method 3 oky

//        Set<String> newSet=new LinkedHashSet<>(list);
//        // must use LinkedHashSet because this not allowed duplicate and also maintain order other hashSet and TreeSet not maintain order and not even
//        System.out.println(newSet);
    }
}
