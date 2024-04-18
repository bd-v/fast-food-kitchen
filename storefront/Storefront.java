package storefront;

import java.util.ArrayList;
import menuItems.*;

public class Storefront {
    private Menu menu = new Menu();

    public void getMenuWelcome() {
        String[] menuCategory = {"Exit", "Burgers", "Hot Dogs", "Sandwiches", "Fries", "Drinks", "Shakes"};

        System.out.println("What would you like to order?");
        for(int i = 0; i < menuCategory.length; i++) {
            System.out.println("\t" + (i + 1) + ". " + menuCategory[i]);
        }
    }

    public void generateMenuHamburger() {
        System.out.println("What would you like to order?");
        ArrayList<Hamburger> menuHamburger = menu.getMenuHamburger();
        for(MenuItem m : menuHamburger) {
            System.out.println("\t" + (menuHamburger.indexOf(m) + 1) + ". " + m);
        }
    }

    public void generateMenuHotDog() {
        System.out.println("What would you like to order?");
        ArrayList<HotDog> menuHotDog = menu.getMenuHotDog();
        for(MenuItem m : menuHotDog) {
            System.out.println("\t" + (menuHotDog.indexOf(m) + 1) + ". " + m);
        }
    }

    public void generateMenuSandwich() {
        System.out.println("What would you like to order?");
        ArrayList<Sandwich> menuSandwich = menu.getMenuSandwich();
        for(MenuItem m : menuSandwich) {
            System.out.println("\t" + (menuSandwich.indexOf(m) + 1) + ". " + m);
        }
    }

    public void generateMenuFries() {
        System.out.println("What would you like to order?");
        ArrayList<Fries> menuFries = menu.getMenuFries();
        for(MenuItem m : menuFries) {
            System.out.println("\t" + (menuFries.indexOf(m) + 1) + ". " + m);
        }
    }

    public void generateMenuDrink() {
        System.out.println("What would you like to order?");
        ArrayList<Drink> menuDrink = menu.getMenuDrink();
        for(MenuItem m : menuDrink) {
            System.out.println("\t" + (menuDrink.indexOf(m) + 1) + ". " + m);
        }
    }

    public void generateMenuMilkshake() {
        System.out.println("What would you like to order?");
        ArrayList<Milkshake> menuMilkshake = menu.getMenuMilkshake();
        for(MenuItem m : menuMilkshake) {
            System.out.println("\t" + (menuMilkshake.indexOf(m) + 1) + ". " + m);
        }
    }
}