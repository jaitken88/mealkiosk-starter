package com.welltestedlearning.mealkiosk;

public class ChickenSandwich implements MenuItem {

    private int price = 6;

    private boolean isSpicy = true;

    private final Toppings toppings;

    public ChickenSandwich(boolean isSpicy) {
        toppings = new Toppings();
        this.isSpicy = isSpicy;
    }

    public ChickenSandwich() {
        toppings = new Toppings();
    }


    @Override
    public void display() {

    }

    @Override
    public int price() {
        for (BurgerTopping burgerTopping : toppings.getToppingsList()) {
            price += burgerTopping.price();
        }
        return price;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void addTopping(BurgerTopping burgerTopping) {
        toppings.add(burgerTopping);

    }
}
