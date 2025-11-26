package inheritance;

class Parent5{
    int i =10;
    void display(){
        System.out.println("parent called ");
    }
}
class Child5 extends Parent{
    int i =100;
    void alpha(){

// using the super keyword we can access parent class properties and method even after that override
        System.out.println("alpha called ");
        System.out.println(i);
        System.out.println(super.i);
        display();
        super.display();
    }
    void display(){
        System.out.println("called display child");
    }
}
public class Inheritance5{
    public static void main(String[] args) {
        new Child5().alpha();
    }
}
