package menuItems;

public abstract class MenuItem {
    private String name;
    private double price;
    private double calories;
    private double carbohydrates;
    private double fatTotal;
    private double sodium;

    public MenuItem(
        String name,
        double price,
        double calories,
        double carbohydrates,
        double fatTotal,
        double sodium
    ) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.fatTotal = fatTotal;
        this.sodium = sodium;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }
    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFatTotal() {
        return fatTotal;
    }
    public void setFatTotal(double fatTotal) {
        this.fatTotal = fatTotal;
    }

    public double getSodium() {
        return sodium;
    }
    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    @Override
    public String toString() {
        return getName() + " - $" + String.format("%.2f", getPrice());
    }
}
