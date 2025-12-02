package Annonomus;

class A{
    public void display1(){
        System.out.println("inside a ");
    }
}

abstract class Child{
   abstract void show1();
}

class Parent extends Child{
    void show1(){
        System.out.println("inside void show ");
    }
}
public class Demo {
    public static void main(String[] args) {
      new A(){
            public void display(){
                System.out.println("called annonomus ");
            }
        }.display();
Child p=new Parent();
p.show1();
    }
}
