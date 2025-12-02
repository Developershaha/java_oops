package service;

public class BlueDart implements IDeliveryService{
    @Override
    public Boolean deliveryProduct(Double amount) {
        System.out.println("product delivered through Blue Dart and amount paid is "+amount);
        return true;
    }
}
