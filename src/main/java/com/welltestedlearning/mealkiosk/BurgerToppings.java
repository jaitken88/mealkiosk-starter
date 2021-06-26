package com.welltestedlearning.mealkiosk;

public enum BurgerToppings {
    CHEESE(1),
    BACON(2),
    AVOCADO(3);

    private final int price;

    BurgerToppings(int price) {
        this.price = price;
    }

    public int price() {
        return price;
    }
}
