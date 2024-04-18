package menuItems;

public class Sandwich extends MenuItem {
    public Sandwich(
        String name,
        double price,
        double calories,
        double carbohydrates,
        double fatTotal,
        double sodium
    ) {
        super(name, price, calories, carbohydrates, fatTotal, sodium);
    }
}
