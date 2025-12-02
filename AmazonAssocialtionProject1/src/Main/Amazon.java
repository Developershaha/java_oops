package Main;

import service.FedEx;
import service.IDeliveryService;

public class Amazon {

    private IDeliveryService service;

    public Amazon(IDeliveryService service){
        this.service=service;
    }

    public void setService(IDeliveryService service) {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount){

//        FedEx fx=new FedEx(); // this is tighly coupled so

        return service.deliveryProduct(amount);
//        Boolean status = fx.deliveryProduct(amount)
//        return true;
    }
}
