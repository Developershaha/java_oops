package ReferrenceSorting.CollectionProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        // find frequency count in the giving array or list

        List<String> list = Arrays.asList(
                "Apple",
                "Banana",
                "Apple",
                "Orange",
                "Banana",
                "Apple");

        Map<String,Integer> map =new HashMap<>();
        for(String fruites:list){
            System.out.println(fruites);
            if(map.containsKey(fruites)){
                map.put(fruites,map.get(fruites)+1);
            }else{
                map.put(fruites,1);
            }
        }
        System.out.println(map);
    }
}
