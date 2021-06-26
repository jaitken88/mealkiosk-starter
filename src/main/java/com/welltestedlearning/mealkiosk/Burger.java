package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Burger implements MenuItem {

    private BurgerToppings burgerToppings;

    private final List<BurgerToppings> burgerToppingsList = new ArrayList<>();

    private int price = 5;

    public Burger(BurgerToppings... theBurgerToppings) {
        Collections.addAll(burgerToppingsList, theBurgerToppings);

    }

    public Burger() {
    }

    @Override
    public int price() {
        for (BurgerToppings toppings : burgerToppingsList) {
            price += toppings.price();
        }
        return price;
    }

    public void display() {
        System.out.println("Burger: " + burgerToppings);
    }

    @Override
    public String toString() {
        return "Burger {" +
            "burgerOption=" + burgerToppings +
            '}';
    }

    public void addTopping(BurgerToppings... burgerToppings) {
        Collections.addAll(burgerToppingsList, burgerToppings);

    }
}
