package PatternFactoryMethod;


public class PizzaDelivery extends DeliveryService {

    @Override
    public Order createOrder() {
        return new PizzaOrder();
    }
}