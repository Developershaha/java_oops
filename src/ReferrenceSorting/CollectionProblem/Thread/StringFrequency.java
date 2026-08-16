package ReferrenceSorting.CollectionProblem.Thread;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class A{
    public void show(){
        System.out.println("show called");
    }
    public void display(){
        System.out.println("called display method");
    }

}
class B extends A {
}

public class StringFrequency {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        List<String> names = Arrays.asList("Rahul", "Amit", "Shahaji", "Vijay");

        String[] fruits = {"bananna","apple"};
         //        Collections.sort(fruits);
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

       List<String > sortedNames= names.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedNames);


//        names.stream().sorted().forEach(System.out::println);

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//
//            Integer n = iterator.next();
//
//            if (n == 20) {
//                iterator.remove();   // ✅
//            }
//            System.out.println(n);
//        }
//        System.out.println(list);

//        String str="apple";
//        String[] newStr=str.split("");
//        List<String> characters=new ArrayList<>();

//        List<String> strings=new ArrayList<>(Arrays.asList("shahaji","kokane"));
//        strings.stream().forEach(s-> System.out.println(s.toUpperCase()));
//        System.out.println(strings.get());
//        strings.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1)).forEach(s-> System.out.println(s));
//        List<String> str1=new ArrayList<>();
//        for(int i =0;i<strings.size();i++){
//            String newStr= strings.get(i).substring(0,1).toUpperCase()+strings.get(1).substring(1);
////            System.out.println(strings.get(i));
//            str1.add(newStr);
//        }



//        for(String str:strings){
//            String newStr= str.substring(0,1).toUpperCase()+str.substring(1);
//            str1.add(newStr);
//        }
//        System.out.println(str1);

//        String arrayOfString={"shahaji","kokane"}
//        for(String ch:newStr){
//           if(!characters.contains(ch)){
//               characters.add(ch);
//           }
//        }
//        System.out.println(characters.get(0));
    }}
