package sample.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,10,45,30,45,5,20));
//       List<Integer> l= list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

//        List<Integer> li=list.stream().filter(el->el%2!=0).map(ele->ele*ele).toList();
//        List<Integer> li=list.stream().skip(1).limit(2).toList();

//        Optional<Integer> li=list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
//        List<Integer> data=li.get();
//        if(li.isPresent())
//        {        System.out.println(li);}

    }
}
