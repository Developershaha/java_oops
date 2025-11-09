package polymorphism;


class Cal {

//    int add(int x, int y) {
//        return x + y;
//    };

    double add(int x,double y){
        return x+y;
    }


//this code though the error
//    double add(double x,int y){
//        return x+y;
//    }


};

public class Launch {

    public static void main(String[] args) {
        Cal c = new Cal();

        System.out.println(c.add(6, 7));

    };
};
