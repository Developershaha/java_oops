package Exception;
class Demo{
    public int display(){
        try {
            System.out.println("display block called");
            return 39;
        }
        finally {
            System.out.println("finally block called ");
            return 50;
        }
    }
}
public class LaunchEH3 {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.display()); d.display();
    }

}
