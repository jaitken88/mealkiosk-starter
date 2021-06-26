package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.List;

public class MealOrder {

    private final List<MenuItem> items = new ArrayList<>();

    public static MealOrder createBurgerOnlyOrder(BurgerToppings burgerToppings) {
        return new MealOrder(burgerToppings);
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

    public MealOrder() {
    }

    public MealOrder(Burger burger) {
        addBurger(burger);
    }

    public MealOrder(BurgerToppings burgerToppings) {
        addBurger(burgerToppings);
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

    public void addBurger(BurgerToppings burgerToppings) {
        items.add(new Burger(burgerToppings));
    }

    public MealOrder(BurgerToppings burger,
        DrinkOption drink) {
        addBurger(burger);
        addDrink(drink.name().toLowerCase());
    }

    public MealOrder(Burger burger, DrinkOption drink) {
        addBurger(burger);
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
        for (MenuItem item : items) {
            item.display();
        }
        System.out.println(price());
    }
}

