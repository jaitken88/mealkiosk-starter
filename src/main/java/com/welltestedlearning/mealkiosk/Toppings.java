package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.List;

public class Toppings {

    private int price = 0;
    final List<BurgerTopping> burgerToppingList = new ArrayList<>();


    public Toppings() {

    }

    public int price() {
        for (BurgerTopping burgerTopping : burgerToppingList) {
            price += burgerTopping.price();
        }
        return price;
    }

    public void add(BurgerTopping burgerTopping) {
        burgerToppingList.add(burgerTopping);
    }

    public List<BurgerTopping> getToppingsList() {
        return burgerToppingList;
    }
}
