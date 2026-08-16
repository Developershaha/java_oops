package sample.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>(Arrays.asList(
                new Employee(3,"Amit","Tech"),
                new Employee(6,"Neha","HR"),
                new Employee(5,"Rahul","Tech"),
                new Employee(4,"Priya","Finance"),
                new Employee(1,"Vikas","Tech"),
                new Employee(2,"Sneha","Marketing"),
                new Employee(7,"Arjun","Tech")
        ));

        List<Employee> data=emp.stream().sorted((e1,e2)->e1.getId()-e2.getId()).collect(Collectors.toList());
//        System.out.println(data.get(1));
        Employee second=data.get(1);
        System.out.println(second.getName()+"  "+second.getDepartment());


        List<String> names= emp.stream()
                .filter(em->em.getDepartment().equals("Tech"))
                .map(Employee::getName)
                .toList();
//                .forEach(System.out::println);
        System.out.println(names);
        // map collect data tupe

        Function<Employee,Integer> f1=(employee -> employee.getId());
        Function<Employee,String> f2=(employee -> employee.getName());

        Map<Integer,String > map=emp.stream().collect(Collectors.toMap(f1,f2));
        System.out.println(map);

        System.out.println(emp.stream().count()); // count return integer long value
        // collect back into data structure

    }
}
