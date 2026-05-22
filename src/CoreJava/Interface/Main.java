package CoreJava.Interface;

public class Main {

    public static void main(String[] args) {
        Amazon am=new Amazon(new FedEx());

        am.deliver();

        am.setService(new Icci());
        am.deliver();


    }


}
