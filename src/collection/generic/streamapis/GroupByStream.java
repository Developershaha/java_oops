package collection.generic.streamapis;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStream {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Amit",
                "Rahul",
                "Ankit",
                "Sneha",
                "Rohit"
        );
        Map<Integer, List<String>> result =
                names.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length
                                )
                        );

        System.out.println(result);

    }
}
