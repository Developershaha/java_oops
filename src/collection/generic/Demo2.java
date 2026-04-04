package collection.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Animal {
    void eat() {
        System.out.println("eating");
    }

    void walk() {
        System.out.println("walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        run(dogs); // not able to do this


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());
        run(animalList);
    }

    //    public static void run(List<Animal> list) { what if i created generic for this method
//        for (Animal animal : list) {
//            animal.eat();
//        }
//    }
    public static void run(List<?> list) { // wild card only use for read

        for (Object obj : list) {
            System.out.println(obj.getClass().getName());

//        obj.add(120); // not able to do this only to read data
        }
    }
}
