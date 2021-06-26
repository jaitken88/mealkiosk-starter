package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
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
        Burger burger = new Burger(BurgerTopping.CHEESE);

        assertThat(burger.price())
            .isEqualTo(6);
    }

    @Disabled
    @Test
    public void baconBurgerCost7() throws Exception {
        Burger burger = new Burger(BurgerTopping.BACON);

        assertThat(burger.price())
            .isEqualTo(7);
    }

    @Test
    public void burgerWithBaconAndRegularBurgerCost12() throws Exception {
        Burger burger1 = new Burger(BurgerTopping.BACON);
        Burger burger2 = new Burger();

        assertThat(burger1.price() + burger2.price())
            .isEqualTo(12);
    }

    @Test
    public void burgerAddToppingCheeseCost6() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE);

        assertThat(burger.price())
            .isEqualTo(6);
    }

    @Test
    public void burgerAddToppingCheeseAndBaconCost8() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE, BurgerTopping.BACON);

        assertThat(burger.price())
            .isEqualTo(8);
    }

    @Test
    public void burgerAddToppingTwoCheeseCost7() throws Exception {
        Burger burger = new Burger();
        burger.addTopping(BurgerTopping.CHEESE, BurgerTopping.CHEESE);

        assertThat(burger.price())
            .isEqualTo(7);
    }


}