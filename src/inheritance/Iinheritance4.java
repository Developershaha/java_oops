package inheritance;


class A{
    A(){
        System.out.println("parent constructor get called");
    }
}

class B extends  A{

}

/*
* in this program we are getting output as parent constructor getting called
*
* its not because of inheritace because constructor are not get particiapate in the inheritance they do
*
*
* get excute when the super() method is called
*
* */
public class Iinheritance4 {
    public static void main(String[] args) {
        B b=new B();
    }
}
