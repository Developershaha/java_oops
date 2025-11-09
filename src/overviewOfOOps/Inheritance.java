package overviewOfOOps;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class Inheritance extends Student {
    int rollNo;
    Inheritance(String name,int rollNo){
        super(name);
        this.rollNo=rollNo;
    }

    public  void display(){
        System.out.println("name "+name);
        System.out.println("rollNO" +rollNo);
    }
    public static void main(String[] args) {
        Inheritance i=new Inheritance("shahaji",90);
        i.display();

    }
}


