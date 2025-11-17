package statics.LaunchStatics;

class Demo{
    static int a,b,c;
    int x,y,z;
    static {

        System.out.println("static block initialise");
        a=10;
        b=20;
        c=30;
    }
    static void display(){
        System.out.println("A"+a);
        System.out.println("B"+b);
        System.out.println("C"+c);
        System.out.println("static method called ");
    }
    {
        x=44;
        y=45;
        z=46;
        System.out.println("instance block initialise");
    }

      Demo(){
        System.out.println("Constructor");
    }
    void display1(){
        System.out.println("A"+a);
        System.out.println("B"+b);
        System.out.println("C"+c);
        System.out.println("X"+x);
        System.out.println("Y"+y);
        System.out.println("Z"+z);

    }
}

public class LunchStatics {
    public static void main(String[] args) {
        Demo.display();
        Demo d=new Demo();
        d.display1();

        System.out.println("*************");
        Demo d2=new Demo();
        d2.display1();
    }
}
