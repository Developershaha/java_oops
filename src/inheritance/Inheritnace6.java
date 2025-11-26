package inheritance;


class Plane6{
       public final  void display(){

           System.out.println("child ");

    }

    static void show(){
        System.out.println("show");
    }
}

class FighterPlane extends Plane6{
//
//   public  void display(){
//
//    }

//    gives error because final method can not get inherited



}
public class Inheritnace6 {

    public static void main(String[] args) {
        FighterPlane fp=new FighterPlane();
        fp.display();
        Plane6 p = new FighterPlane();
        p.show();  // calls Plane6.show()  (parent version)

    }
}
