package PatternFactoryMethod;

public class GroceryDelivery extends DeliveryService {

    @Override
    public Order createOrder() {
        return new GroceryOrder();
    }
}