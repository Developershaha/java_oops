package Exception;
class Demo1{
    public void alpha(){
        System.out.println("alpha called");
        beta();
    }
    public void beta(){
        System.out.println("beta called");
        alpha();
    }
}
public class LaunchEh5 {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        d.beta();
    }
}
