package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
    int age;
    String name;
    double avg;

    @Override
    public String toString() {
        return "Cricketer[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +

                ']';
    }

    public Cricketer(int age, String name, double avg){
        this.age=age;
        this.name=name;
        this.avg=avg;
    }
}

class SortElement implements Comparator<Cricketer> {

    @Override
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.avg>o2.avg){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class CollectL1 {
    public static void main(String[] args) {
        Cricketer c1=new Cricketer(35,"Virat kohli ",179.8);
        Cricketer c2=new Cricketer(46,"rohit sharma " , 78);
        Cricketer c3=new Cricketer(44,"doni",100);
        ArrayList<Cricketer> list=new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        SortElement s=new SortElement();
        Collections.sort(list,s);
        System.out.println(list);

    }
}

// interface we can impliment  in three ways 1) interface , annonomus class lambhda expression 

