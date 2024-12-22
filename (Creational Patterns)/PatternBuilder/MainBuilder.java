package PatternBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        Order order1 = new OrderBuilder()
                .setMainDish("Steak")
                .setSideDish("Risotto")
                .setDrink("Red Wine")
                .setDessert("Cheesecake")
                .build();

        System.out.println(order1);

        Order order2 = new OrderBuilder()
                .setSideDish("Tartar")
                .setDrink("Gin")
                .build();

        System.out.println(order2);
    }
}

