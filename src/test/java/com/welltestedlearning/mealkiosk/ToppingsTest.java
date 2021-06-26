package com.welltestedlearning.mealkiosk;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class ToppingsTest {
    @Test
    public void noToppingsIsZeroPrice() {
        Toppings toppings = new Toppings();

        assertThat(toppings.price())
            .isZero();
    }

    @Test
    public void baconAndCheeseCosts3() {
        Toppings toppings = new Toppings();
        toppings.add(BurgerTopping.CHEESE);
        toppings.add(BurgerTopping.BACON);

        assertThat(toppings.price())
            .isEqualTo(3);
    }
}