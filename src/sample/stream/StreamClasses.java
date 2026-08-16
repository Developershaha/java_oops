package sample.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClasses {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(12,34,123,45,6,6,7,8));
//        Stream<Integer> stream=numbers.stream();
//        stream.forEach(element-> System.out.println(element));
        // forEact imppliment consumer interface

//        numbers.stream().forEach(element-> System.out.println(element));

//        numbers.stream().filter(element->element%2==0).forEach(ele-> System.out.println(ele));
        numbers.stream()
                .filter(ele->ele%2==0) // predicate
                .map(element->element*element) // function impliementation
                .forEach(ele-> System.out.println(ele)); // consumer
    }

}
