package CoreJava.OOPsconcept.inheritance;


class Animal{
    void sound(){
        System.out.println("animal sound");
    }
    void eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog sound");
    }
    void bark(){
        System.out.println("dog barks ");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Animal a =new Dog(); // dog is actual object oky
//        a.sound(); // we have reference of parent class but first refer to child class if that method is not found then it will serach in child mclass
         // dynamic method dispatch - means at the runtime decide which object method got excute
        Animal a; // class reference
        a=new Animal();
        a.sound();

        a=new Dog();
        a.sound();


        /// learn upcasting and downcasting oky

        // upcasting means converting child reference into parent reference
        Animal upcasting=new Dog(); // this is upcasting reference type is parent and actual object is child oky
        upcasting.eat();
//        upcasting.bark();// not posible because point to animal

        // downcasting means parent references convert into child references
        Animal d=new Dog();
        Dog d1=(Dog) d;
//        d1. now i can access all the method because i have downcast the object oky downcast is dengrous
        /*
        * Animal a= new Cat();
        * Dog d=(Dog) a; // this is dangerous code
        * */

    }
}
