package PatternBuilder;

public class Order {
    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;

    public Order(String mainDish, String sideDish, String drink, String dessert) {
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Order: \n" +
                "Main Dish: " + mainDish + "\n" +
                "Garnish: " + sideDish + "\n" +
                "Drink: " + drink + "\n" +
                "Dessert: " + dessert;
    }
}