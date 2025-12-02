package service;

public class FedEx implements IDeliveryService{
    @Override
    public Boolean deliveryProduct(Double amount) {
        System.out.println("product delivered through Fed ex and amount paid is "+amount);
        return false;
    }
}
