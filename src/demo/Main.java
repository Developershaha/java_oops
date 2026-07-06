package demo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer ,Student> studentMap=new HashMap<>();

        // Add 3 Students
        studentMap.put(101, new Student(101, "Rahul", 22));
        studentMap.put(102, new Student(102, "Priya", 21));
        studentMap.put(103, new Student(103, "Amit", 23));
        int searchId=102;
        System.out.println("student found "+studentMap.get(searchId));
    }
}
