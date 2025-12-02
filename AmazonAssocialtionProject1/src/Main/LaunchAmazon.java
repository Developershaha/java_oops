package Main;

import service.BlueDart;
import service.FedEx;
import service.FirstFlight;

public class LaunchAmazon {

    public static void main(String[] args) {
        Amazon amz=new Amazon(new FirstFlight());
//        amz.setService(new FedEx());
//        amz.setService(new FirstFlight());

      Boolean status=  amz.deliverTheProduct(4545.5);
      if(status)
          System.out.println("Product delivered successfully");
      else
          System.out.println("Product not delivered");
    }
}
