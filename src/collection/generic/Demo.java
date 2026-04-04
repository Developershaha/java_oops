package collection.generic;

import java.util.ArrayList;
import java.util.List;

class Human{
    public void sleep(){
        System.out.println("human sleeping");
    }
}

class Employee extends Human{
    public void walk(){
        System.out.println("employee walking  ");
    }
}
public class Demo {
    public static void main(String[] args) {
        Human human=new Human();
        Human human1=new Human();

        Employee employee=new Employee();
        Employee employee1=new Employee();


        List<Human> humanList=new ArrayList<>();
        humanList.add(human1);
        humanList.add(human);

        List<Employee> employeeList =new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
//        invokedSleep(humanList);
        invokedSleep(employeeList);
    }

    public static void invokedSleep(List<? extends Human> list){

        for(Human human:list){
            human.sleep();
        }
    }
}
