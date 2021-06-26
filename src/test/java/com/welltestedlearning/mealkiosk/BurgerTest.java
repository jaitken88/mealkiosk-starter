package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BurgerTest {

    @Test
    public void burgerWithNoToppingsCosts5() throws Exception {
        Burger burger = new Burger();

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

    @Test
    public void baconCheeseBurgerAndRegularBurgerCost13() throws Exception {
        Burger burger1 = new Burger(BurgerOption.BACONCHEESEBURGER);
        Burger burger2 = new Burger();

        assertThat(burger1.price() + burger2.price())
            .isEqualTo(13);
    }

}