package inheritance;


class Aeroplane{

    void fly(){
        System.out.println("Aeroplane flies");
    }

    void landing(){
        System.out.println("Aeroplane is landing ");
    }

}

class CargoPlane extends Aeroplane{


}

class CommercialPlane extends CargoPlane{
    void demo(){
        System.out.println("called demo");
    }
    // we have achive multiple inheritance

}

// no relationship between any class -- inheritance promotes is - a relationship
public class Inheritnace2 {
    public static void main(String[] args) {

        CargoPlane cp=new CargoPlane();
        cp.fly();
        cp.landing();
//        cp.demo();
        CommercialPlane c= new CommercialPlane();
        c.fly();
        c.demo();


    }
}
