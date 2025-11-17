package statics.LaunchStatics;

class Demo2{
    static {
        display();
    }

    static int a=10;
    static void display(){
        System.out.println("a"+a);
    }
}

public class LaunchStatic3 {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        Demo2.display();
    }


}
