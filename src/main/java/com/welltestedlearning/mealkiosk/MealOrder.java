package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MealOrder {

    private final List<MenuItem> items = new ArrayList<>();

    public static MealOrder createBurgerOnlyOrder(BurgerTopping burgerTopping) {
        return new MealOrder(burgerTopping);
    }

    public static MealOrder createBurgerOnlyOrder(Burger burger) {
        return new MealOrder(burger);
    }

    public static void main(String[] args) {
        MealOrder drinkOrder = new MealOrder();
        drinkOrder.addDrink(Drink.DRINK_LARGE);
        drinkOrder.display();

        MealOrder burgerOrder = createBurgerOnlyOrder(new Burger());
        burgerOrder.display();
    }

    public MealOrder(MenuItem menuItem) {
        items.add(menuItem);
    }

    public MealOrder() {
    }

    public MealOrder(Burger burger) {
        addBurger(burger);
    }

    public MealOrder(BurgerTopping burgerTopping) {
        addBurger(burgerTopping);
    }

    public void addDrink(String drinkSize) {
        items.add(new Drink(drinkSize));
    }

    public void addFries(String friesSize) {
        items.add(new Fries(friesSize));
    }

    public void addBurger(Burger burger) {
        items.add(burger);
    }

    public void addBurger(BurgerTopping burgerTopping) {
        items.add(new Burger(burgerTopping));
    }

    public MealOrder(BurgerTopping burger,
        DrinkOption drink) {
        addBurger(burger);
        addDrink(drink.name().toLowerCase());
    }

    public MealOrder(MenuItem menuItem, DrinkOption drink) {
        items.add(menuItem);
        addDrink(drink.name().toLowerCase());
    }

    public int price() {
        // loop over all items and sum their price
        int price = 0;
        for (MenuItem item : items) {
            price = price + item.price();
        }
        return price;
    }

    public void display() {
        for (MenuItem menuItem : items) {
            menuItem.display();
        }
        System.out.println("Price: " + price());
    }

    public void addItem(MenuItem... menuItem) {
        Collections.addAll(items, menuItem);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MenuItem menuItem : items) {
            stringBuilder.append(menuItem.toString());
            if (items.size() > 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}

