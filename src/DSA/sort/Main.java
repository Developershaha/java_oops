package DSA.sort;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;

    }

    @Override
    public int compareTo(Student other) {
        return this.age- other.age;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(29);
        list.add(10);
        list.add(9);
        list.add(100);


        ArrayList<Student> list2=new ArrayList<>();
        list2.add(new Student(45,"shahaji"));
        list2.add(new Student(21,"dipali"));
        Collections.sort(list2);
        for(Student s : list2){
            System.out.println(s.age +" " +s.name);
        }

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
