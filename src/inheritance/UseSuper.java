package inheritance;

class ParentSuper {
     void display() {
        System.out.println("parent called");
    };
}

class BaseChild extends ParentSuper {

    public void display() {
        System.out.println("child display called");
    };

    void demo(){
        System.out.println("demo");
    }

}

public class UseSuper {
    public static void main(String[] args) {
        ParentSuper bs = new BaseChild();
        bs.display();
    }

}


