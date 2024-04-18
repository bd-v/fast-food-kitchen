package storefront;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import menuItems.*;

public class Menu {
    private ArrayList<MenuItem> menuGeneral = new ArrayList<MenuItem>();
    private ArrayList<Hamburger> menuHamburger = new ArrayList<Hamburger>();
    private ArrayList<HotDog> menuHotDog = new ArrayList<HotDog>();
    private ArrayList<Sandwich> menuSandwich = new ArrayList<Sandwich>();
    private ArrayList<Fries> menuFries = new ArrayList<Fries>();
    private ArrayList<Drink> menuDrink = new ArrayList<Drink>();
    private ArrayList<Milkshake> menuMilkshake = new ArrayList<Milkshake>();

    public Menu() {
        generateMenuGeneral();
    }

    public void generateMenuGeneral() {
        try{
            File file = new File("menuItems/menu-items.txt");
            Scanner scnr = new Scanner(file);

            while(scnr.hasNextLine()) {
                String line = scnr.nextLine();
                String[] lineArray = line.split(",");
                String[] menuCategory = {"burger", "hot_dog", "sandwich", "fries", "drink", "milkshake"};

                if(lineArray[0].equals(menuCategory[0])) {
                    Hamburger m = new Hamburger(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuHamburger.add(m);
                } else if(lineArray[0].equals(menuCategory[1])) {
                    HotDog m = new HotDog(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuHotDog.add(m);
                } else if(lineArray[0].equals(menuCategory[2])) {
                    Sandwich m = new Sandwich(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuSandwich.add(m);
                } else if(lineArray[0].equals(menuCategory[3])) {
                    Fries m = new Fries(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuFries.add(m);
                } else if(lineArray[0].equals(menuCategory[4])) {
                    Drink m = new Drink(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuDrink.add(m);
                } else if(lineArray[0].equals(menuCategory[5])) {
                    Milkshake m = new Milkshake(
                        lineArray[1],
                        Double.valueOf(lineArray[2]),
                        Double.valueOf(lineArray[3]),
                        Double.valueOf(lineArray[4]),
                        Double.valueOf(lineArray[5]),
                        Double.valueOf(lineArray[6])
                        );
                    menuGeneral.add(m);
                    menuMilkshake.add(m);
                }
            }
            scnr.close();
        } catch(FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<Hamburger> getMenuHamburger() {
        return menuHamburger;
    }
    public ArrayList<HotDog> getMenuHotDog() {
        return menuHotDog;
    }
    public ArrayList<Sandwich> getMenuSandwich() {
        return menuSandwich;
    }
    public ArrayList<Fries> getMenuFries() {
        return menuFries;
    }
    public ArrayList<Drink> getMenuDrink() {
        return menuDrink;
    }
    public ArrayList<Milkshake> getMenuMilkshake() {
        return menuMilkshake;
    }
}
