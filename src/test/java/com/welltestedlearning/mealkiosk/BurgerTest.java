package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BurgerTest {

    @Test
    public void regularBurgerCosts5() throws Exception {
        Burger burger = new Burger(BurgerOption.REGULAR);

        int price = burger.price();

        assertThat(price)
            .isEqualTo(5);
    }

    @Test
    public void cheeseburgerCosts6() throws Exception {
        Burger burger = new Burger(BurgerOption.CHEESEBURGER);

        assertThat(burger.price())
            .isEqualTo(6);
    }

    @Test
    public void baconCheeseburgerCost8() throws Exception {
        Burger burger = new Burger(BurgerOption.BACONCHEESEBURGER);

        assertThat(burger.price())
            .isEqualTo(8);
    }

}