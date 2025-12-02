package service;

public class FirstFlight implements IDeliveryService{
    @Override
    public Boolean deliveryProduct(Double amount) {
        System.out.println("product delivered through First Flight and amount paid is "+amount);
        return true;
    }
}
