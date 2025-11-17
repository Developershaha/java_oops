package statics.LaunchStatics;

class Alien{

    static{
        System.out.println("static block first execute");
    }
    static{
        System.out.println("static block second execute");
    }

    {
        System.out.println("java initialisation block execute");
    }

    {
        System.out.println("java initialisation second execute");
    }
}

public class LaunchStatic2 {
    public static void main(String[] args) {
        Alien a=new Alien();
        Alien b=new Alien();
    }
}
