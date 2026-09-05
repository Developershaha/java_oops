package CoreJava.OOPsconcept.inheritance;

class Student{

    // this reference to current object or instance
    int id;
    String name;
    Student(int id,String name){
        this.id=id; // this.id means instnace variable not a local variable oky this is used to resolve variable conflict
        this.name=name;
    }

    void display(){
        System.out.println("display");
    }
    void callCurrentClassMethodUsingThis(){
        System.out.println("called first method");
        this.display();
    }
}
public class ThisClass {
    public static void main(String[] args) {
        Student s=new Student(2,"shahaji");
        s.callCurrentClassMethodUsingThis();
    }
}
