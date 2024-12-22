package PatternFactoryMethod;

public abstract class DeliveryService {
    public abstract Order createOrder();
    public void deliver(Order order) {
        System.out.println("Delivering order: " + order);
    }
}