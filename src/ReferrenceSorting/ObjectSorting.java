package ReferrenceSorting;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
public class ObjectSorting {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101, "Rahul", 70000),
                new Employee(102, "Amit", 50000),
                new Employee(103, "Neha", 90000),
                new Employee(104, "Rohit", 65000),
                new Employee(105, "Akash", 90000)
        );

        List<Integer> numbers = Arrays.asList(100,20,20,30,3,4,6,7);
        List<Integer> num=   numbers.stream()
//                .peek(number -> System.out.println(number))
                .map(number -> number * 2)
                .collect(Collectors.toList());

        int count=(int)numbers.stream().count();
        System.out.println(count);

        int sum = numbers.stream()
                .reduce(0, (a,b) -> a+b);

        System.out.println(sum);
//       List<Integer> num= numbers.stream()
//                .map(number -> number * 2)
//               .sorted()
//               .distinct()
////               .limit(2)
//               .skip(1)
//                .collect(Collectors.toList());

//        System.out.println(num);
//        Optional<Integer> secondHighestSalary = employees.stream()
//                .map(employee -> employee.getSalary())
//                .distinct()
//                .sorted((s1, s2) -> Integer.compare(s2, s1))
//                .collect(Collectors.toList());

//        System.out.println(secondHighestSalary.get());

//       List<Integer> salary= employees.stream().map(student->student.getSalary())
//               .sorted((a,b)->a-b)
//               .collect(Collectors.toList());

//       List<Employee> empList=employees.stream()
//                       .sorted((e1,e2)->).collect(Collectors.toList());


//       String name1="shahaji";
//       String name2="shahaji";
//        System.out.println(name1==name2); // compare the reference not the value
//        System.out.println(name1.equals(name2)); // compare the value not referrences
//
//        String city1=new String("shahaji");
//        String city2 =new String("shahaji");
//        Integer a=10;
//        Integer b=10;
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//        System.out.println(salary);
//        empList.forEach((student -> System.out.println(student.getSalary()+"  "+student.getName())));
    }
}