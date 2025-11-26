package inheritance;
class Telusko{
    private  String name="shahaji";
    void display(){
        System.out.println("name is "+name);
    }
}

class Alience extends Telusko{

    // this is now we are able to change becuase we have applied default access modified once when i make it as private then compile through error


    //
    void disp(){
//        name="kokane";
    }

}
public class Inheritance3 {

    public static void main(String[] args) {
        Alience al=new Alience();
        al.display();
        al.disp();
//        System.out.println("accessign name "+al.name);
    }
}
