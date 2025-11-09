package overviewOfOOps;

public class StaticVariable {

    static int data=20;

    void display(){

        int a;
//        System.out.println("dsdfs"+a);

        // for local variable no default value is assign it through the compile time error
        System.out.println("print static data "+data);
        data++;
    }
    public static void main(String[] args) {
        StaticVariable s=new StaticVariable();

        s.display();
        s.display();
        s.display();
        System.out.println("main method "+data);
    }
}
