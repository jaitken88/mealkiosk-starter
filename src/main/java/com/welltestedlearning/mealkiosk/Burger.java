package com.welltestedlearning.mealkiosk;

public class Burger implements MenuItem {

    private BurgerToppings burgerToppings;
    private final int regularBurger = 5;

    public Burger(BurgerToppings theBurgerToppings) {
        burgerToppings = theBurgerToppings;
    }

    public Burger() {

    }

    @Override
    public int price() {
        if (burgerToppings == null) {
            return regularBurger;
        } else if (burgerToppings.equals(BurgerToppings.CHEESE)) {
            return regularBurger + BurgerToppings.CHEESE.price();
        } else if (burgerToppings.equals(BurgerToppings.BACON)) {
            return regularBurger + BurgerToppings.BACON.price();
        } else if (burgerToppings.equals(BurgerToppings.AVOCADO)) {
            return regularBurger + BurgerToppings.AVOCADO.price();
        }
        return 0;
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
}
