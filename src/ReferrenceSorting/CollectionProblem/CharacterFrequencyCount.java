package ReferrenceSorting.CollectionProblem;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount {
    public static void main(String[] args) {
        //
        String str="shahaji"; // a-2 and h-2

//        for(Character ch : str){
//
//        }

        Map<String ,Integer> map=new HashMap<>();
//
//        for(int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//            if(map.containsKey(str.charAt(i))){
//                map.put(str.charAt(i),map.get(str.charAt(i))+1);
//            }else{
//                map.put(str.charAt(i),1);
//            }
//        }

        String[] newStr=str.split("");
//        System.out.println(newStr);
        for(String ch:newStr){
            System.out.println(ch);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        for(Map.Entry<String,Integer> mapNew:map.entrySet()){
            if(mapNew.getValue()>1){
                System.out.println(mapNew.getKey()+ " ==>  "+mapNew.getValue() );
            }

        }
    }
}
