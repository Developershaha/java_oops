package constructor;


class Demo{
    int num1,num2;
    Demo(){
        System.out.println("zero parameterised constructor called ");
    }
    Demo(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        System.out.println("two parameterised called ");
    }
    Demo(int num1){
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
public class LunchConstructore {
    public static void main(String[] args) {
        Demo d =new Demo(4);
        d.display();
    }
}
