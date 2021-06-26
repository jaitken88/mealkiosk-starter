package com.welltestedlearning.mealkiosk;

public class Burger implements MenuItem {

    private BurgerTopping burgerTopping;

    private final Toppings toppings = new Toppings();

    private int price = 5;

    public Burger(BurgerTopping... theBurgerToppings) {
        for (BurgerTopping burgerTopping : theBurgerToppings) {
            toppings.add(burgerTopping);
        }

    }

    public Burger() {

    }

    @Override
    public int price() {
        for (BurgerTopping topping : toppings.getToppingsList()) {
            price += topping.price();
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
        for (BurgerTopping topping : burgerToppings) {
            toppings.add(topping);
        }

    }
}
