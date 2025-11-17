package inheritance;

import overviewOfOOps.Inheritance;

class Parent{
    int age ;
    void display(){
        age=60;
        System.out.println("called parent "+age);
    }
}

class Child extends  Parent{

    // code reusability --- one class access all the data from  parent class yes we have age and display method in this class

    // now one class aquires  properities and behaviour of another class is called inheritance and its promotes code reusability


    // child subclass derived class --- parent class super class and base class
}

public class Inheritance1 {
    public static void main(String[] args) {
        Child d =new Child();
        d.display();

    }


}
