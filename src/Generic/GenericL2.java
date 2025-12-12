package Generic;

import java.util.ArrayList;

class Employee{
    private Integer id;
    private String name;
    private String city;
    public Employee(Integer  id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;

    }

    @Override
    public String toString() {
        return "Employee [ id=" +id+" name="+ name+" city="+city+" ]";
    }
}
public class GenericL2 {
    public static void main(String[] args) {
        ArrayList<Employee> el=new ArrayList<>();
        el.add(new Employee(1,"shahaji","pune"));
        el.add(new Employee(2,"shivaji","nande"));
        for(Employee e:el){
            System.out.println(e);
        }

    }
}
