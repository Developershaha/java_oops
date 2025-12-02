package polymorphism;

class Animal{
    public void eat(){
        System.out.println("animal is eating");
    }
    public void running(){
        System.out.println("animal is running");
    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("tiger hunts and ear");
    }
    public void running(){
        System.out.println("tiger run for hunts ");
    }
    public void show(){
        System.out.println("showing");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("monkey steal and eats ");
    }
    public void running(){
        System.out.println("monkey is running after steal");
    }
}

class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.running();
        ((Tiger) animal).show();
    }
}
public class RealPoly {
    public static void main(String[] args) {
        Tiger tr=new Tiger();
        Monkey mk=new Monkey();
        Forest fr=new Forest();
        fr.permit(tr);
        fr.permit(mk);
    }
}
