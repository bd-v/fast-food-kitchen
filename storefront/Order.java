package storefront;

import java.util.ArrayList;
import menuItems.*;

public class Order {
    Menu menu = new Menu();
    private ArrayList<MenuItem> bag = new ArrayList<MenuItem>();

    public Order(ArrayList<MenuItem> bag) {
        this.bag = bag;
    }

    public MenuItem getItemHamburger(int menuItem) {
        return menu.getMenuHamburger().get(menuItem - 1);
    }
    public MenuItem getItemHotDog(int menuItem) {
        return menu.getMenuHotDog().get(menuItem - 1);
    }
    public MenuItem getItemSandwich(int menuItem) {
        return menu.getMenuSandwich().get(menuItem - 1);
    }
    public MenuItem getItemFries(int menuItem) {
        return menu.getMenuFries().get(menuItem - 1);
    }
    public MenuItem getItemDrink(int menuItem) {
        return menu.getMenuDrink().get(menuItem - 1);
    }
    public MenuItem getItemMilkshake(int menuItem) {
        return menu.getMenuMilkshake().get(menuItem - 1);
    }

    public void addToBag(MenuItem menuItem) {
        bag.add(menuItem);
    }

    public String getSpaces(MenuItem menuItem) {
        int length = menuItem.getName().length();
        int numSpaces = 32 - length;
        String spaces = "";

        for(int i = 0; i < numSpaces; i++) {
            spaces = spaces + " ";
        }

        return spaces;
    }

    public void getBag() {
        for (MenuItem m : bag) {
            int qty = 1;
            System.out.println(m.getName() + getSpaces(m) + qty + "\t\t$" + m.getPrice());
        }
    }

    public String getTotalPrice() {
        double priceTotal = 0;
        for(MenuItem m : bag) {
            priceTotal = priceTotal + m.getPrice();
        }

        return String.format("%.2f", priceTotal);
    }

    public void getReciept() {
        System.out.println("Name" + "\t\t\t\t" + "Qty" + "\t\t" + "Price");
        getBag();
        System.out.println("\nTotal\t\t\t\t\t\t$" + getTotalPrice());
    }
}
