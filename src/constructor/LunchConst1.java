package constructor;


class Demo1{
    int num1,num2;
    Demo1(){
        System.out.println("zero parameterised constructor called ");
    }
    Demo1(int num1,int num2){
        this(num1);
        this.num1=num1;
        this.num2=num2;
        System.out.println("two parameterised called ");
    }
    Demo1(int num1){
        this();
        this.num1=num1;
        num2=44;
        System.out.println("one parameterised constructor called ");
    }
    void display(){
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
public class LunchConst1 {
    public static void main(String[] args) {
        Demo1 d =new Demo1(4);
        d.display();

        System.out.println("*************");

        Demo1 d2=new Demo1(22,67);
        d2.display();
    }
}
