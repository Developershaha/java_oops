package ReferrenceSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateCharacter {

    public static void main(String[] args) {
List<Integer> list= Arrays.asList(12,56,43,24,6,78,1);
List<Integer> list3=List.of(12,3,5,6,78,8);
List<Integer> list1=new ArrayList<>(list);
list.set(2,1); //
        list1.add(0);
Collections.sort(list);
// Arrays
System.out.println(list1);

    }
}
