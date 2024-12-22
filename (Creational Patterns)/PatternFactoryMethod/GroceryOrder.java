package PatternFactoryMethod;

public class GroceryOrder implements Order {

    @Override
    public String getDescription() {
        return "eggs";
    }
}