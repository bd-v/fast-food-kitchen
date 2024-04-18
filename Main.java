import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import storefront.*;
import menuItems.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Storefront fiveGuys = new Storefront();
        ArrayList<MenuItem> bag = new ArrayList<MenuItem>();
        Order order = new Order(bag);

        boolean isActive = true;
        boolean hasException = true;
        int chooseMenuCategory = 0;
        int chooseMenuItem = 0;
        MenuItem menuItem;

        System.out.print("\033\143");
        System.out.println("*** Welcome to Five Guys! ***");

        while(isActive) {

            // customer chooses menuCategory
            while(hasException) {
                try{
                    fiveGuys.getMenuWelcome();
                    chooseMenuCategory = scnr.nextInt();
                    hasException = false;
                } catch(InputMismatchException e) {
                    System.out.println("Caught InputMismatchException: Please input an integer");
                    scnr.nextLine();
                }
            }
            hasException = true;
            System.out.print("\033\143");

            // customer chooses menuItem
            switch(chooseMenuCategory) {
                case 1:
                    isActive = false;
                    break;

                case 2:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuHamburger();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemHamburger(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;

                case 3:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuHotDog();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemHotDog(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;

                case 4:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuSandwich();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemSandwich(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;

                case 5:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuFries();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemFries(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;

                case 6:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuDrink();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemDrink(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;

                case 7:
                    while(hasException) {
                        try{
                            fiveGuys.generateMenuMilkshake();
                            chooseMenuItem = scnr.nextInt();
                            menuItem = order.getItemMilkshake(chooseMenuItem);
                            order.addToBag(menuItem);
                            hasException = false;
                        } catch(InputMismatchException e) {
                            System.out.println("Caught InputMismatchException: Please input an integer");
                            scnr.nextLine();
                        }
                    }
                    hasException = true;
                    break;
            }
            System.out.print("\033\143");
        }
        order.getReciept();
        scnr.close();
    }
}