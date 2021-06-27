package com.welltestedlearning.mealkiosk;

import java.util.Scanner;

public class MealKioskConsole {

    private static boolean orderComplete = false;

    public static void main(String[] args) {
        // do console I/O here
        Scanner scanner = new Scanner(System.in);
        MealOrder mealOrder = new MealOrder();
        while (!orderComplete) {
            System.out.println("What toppings do you want on your burger?"
                + "none, cheese, bacon, avocado");

            String toppingSelection = scanner.nextLine().toLowerCase();
            Burger burger = new Burger();
            if (toppingSelection.contains("avocado")) {
                burger.addTopping(BurgerTopping.AVOCADO);
            }
            if (toppingSelection.contains("bacon")) {
                burger.addTopping(BurgerTopping.BACON);
            }
            if (toppingSelection.contains("cheese")) {
                burger.addTopping(BurgerTopping.CHEESE);
            }

            System.out.println("What size drink do you want? Regular or large?");
            String drinkSelection = scanner.nextLine();
            Drink drink = new Drink(drinkSelection.toLowerCase());

            mealOrder.addItem(burger, drink);

            System.out.println("Does that complete your order? Y/N");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                orderComplete = true;
            }

            if (orderComplete) {
                mealOrder.display();
            }
        }

    }
}
