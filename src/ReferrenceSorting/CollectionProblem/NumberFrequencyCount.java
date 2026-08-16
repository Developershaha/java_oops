package ReferrenceSorting.CollectionProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberFrequencyCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 10, 50);
        Map<Integer,Integer> map=new HashMap<>();

        for(Integer number : list){
            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }else{
                map.put(number,1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> mapData: map.entrySet()){
            if(mapData.getValue()>1){
                System.out.println(mapData.getKey() + " = " + mapData.getValue());

            }
        }

    }
}
