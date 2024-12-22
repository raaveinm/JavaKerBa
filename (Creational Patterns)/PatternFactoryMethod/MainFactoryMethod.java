package PatternFactoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        DeliveryService pizzaDelivery = new PizzaDelivery();
        Order pizzaOrder = pizzaDelivery.createOrder();
        pizzaDelivery.deliver(pizzaOrder);

        DeliveryService groceryDelivery = new GroceryDelivery();
        Order groceryOrder = groceryDelivery.createOrder();
        groceryDelivery.deliver(groceryOrder);
    }
}