package CoreJava.Interface;

interface Demo {
    // interface contain only body and have default method and static method as well as and have constant as well as

    // all method are public abrstract oky and public abstrat and final are contant by default

    int show(int a, int b); // abstract method oky
    // default method

    default void display(){
        System.out.println("display method calledd");
    }
    // static method - to calling static method no need to create object oky
    static void displayStaticMethod(){
        System.out.println("hey static method display ");
    }
    // variable are bydefault - public static final oky
    int a=10;
}

public class Interface1 implements Demo {
    @Override
    public int show( int a, int b){
        if(a>b){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
      Interface1 int1=new Interface1();
        System.out.println(int1.show(4,2));
        int1.display();
        Demo.displayStaticMethod();
        System.out.println(Demo.a);

    }
}
