package sample.LamdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaImpl {
    public static void main(String[] args) {
//        Animal an=new Dog();
//        an.sound();

        // functional interface is the interface which has exact only one abstract method
//        an.show();

//        Animal animal=new Dog(){
//            @Override
//            public  void sound(){
//                System.out.println("annonomous class called");
//            }
//        };

//        Animal animal1=new Dog(){
//            @Override
//            public void sound(){
//                System.out.println("animal 2 called");
//            }
//        };

        // lamda - its provide shorter way to impliemnt functional interface before java 8 functional interface impliment usign annonaomous classes

        // lamda syntac ()-> that it // have lots of built in functional interface
        // lambda expression provides shorter way to impliment functional interface
        Predicate<Integer> p=(num)->num%2==0;

        Predicate<String> p1=(str->str.isEmpty());
//        System.out.println(p1.test("shahaji"));
//        System.out.println(p.test(8));

        // function lambda expression which take one argumetn adn return modified argument -- map
        Function<String ,Integer> fn=(str->str.length());
//        System.out.println(fn.apply("shahaji"));

        // consumer function - take one argument but don't return anything
        Consumer<Integer> cn=(str)-> System.out.println(str);
        cn.accept(78);

        // supplier don't not take any argumetn but it return value

        Supplier<Integer> num=()->{
            return 343;
        };
//        Animal a= Animal::calculate;
//        System.out.println(num.get());
//
//        Animal a=()-> System.out.println("called lamda expression");
//        a.sound();
//        a.show();

    }
}
