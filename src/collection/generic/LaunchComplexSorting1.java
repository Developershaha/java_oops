package collection.generic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Alpha implements Comparator<Cricketer> {
//    @Override
//    public int compare(Cricketer o1, Cricketer o2) {
//        if (o1.avg > o2.avg)
//            return 1;
//        else
//            return -1;
//    }
//}

class Cricketer {
    int age;
    String name;
    double avg;


    public Cricketer(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}

public class LaunchComplexSorting1 {
    public static void main(String[] args) {

        Cricketer c1 = new Cricketer(28, "virat", 145.78);
        Cricketer c2 = new Cricketer(35, "donhi", 100.09);
        Cricketer c3 = new Cricketer(32, "rohit", 121.3);
        ArrayList<Cricketer> list = new ArrayList<Cricketer>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
//        Collections.sort(list) // getting ce because we have object data so nothing no - compile time error
//        Alpha a = new Alpha();

        // functional interface oky
//        Comparator<Cricketer> c = new Comparator<Cricketer>() {
//            @Override
//            public int compare(Cricketer o1, Cricketer o2) {
//                if (o1.avg > o2.avg) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };

        // write lambda expresion oky

        Comparator<Cricketer> c = (Cricketer o1, Cricketer o2) -> {
            {
                if (o1.avg > o2.avg) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list, c);
        System.out.println(list);

    }
}
