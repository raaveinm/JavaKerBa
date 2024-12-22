package PatternFactoryMethod;

public class PizzaOrder implements Order {

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
