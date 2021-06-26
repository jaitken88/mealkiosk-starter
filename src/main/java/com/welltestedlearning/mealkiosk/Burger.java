package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Burger implements MenuItem {

    private BurgerTopping burgerTopping;

    private final List<BurgerTopping> burgerToppingList = new ArrayList<>();

    private int price = 5;

    public Burger(BurgerTopping... theBurgerToppings) {
        Collections.addAll(burgerToppingList, theBurgerToppings);

    }

    public Burger() {
    }

    @Override
    public int price() {
        for (BurgerTopping toppings : burgerToppingList) {
            price += toppings.price();
        }
        return price;
    }

    public void display() {
        System.out.println("Burger: " + burgerTopping);
    }

    @Override
    public String toString() {
        return "Burger {" +
            "burgerOption=" + burgerTopping +
            '}';
    }

    public void addTopping(BurgerTopping... burgerToppings) {
        Collections.addAll(burgerToppingList, burgerToppings);

    }
}
