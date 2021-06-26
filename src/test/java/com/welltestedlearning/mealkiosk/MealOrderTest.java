package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MealOrderTest {

    @Test
    public void emptyMealIsZeroPrice() throws Exception {
        MealOrder mealOrder = new MealOrder();

        assertThat(mealOrder.price())
            .isZero();
    }

    @Test
    public void mealWithCheeseBurgerIs6() throws Exception {
        MealOrder mealOrder = new MealOrder(BurgerToppings.CHEESE);

        assertThat(mealOrder.price())
            .isEqualTo(6);
    }

    @Test
    public void mealWithRegularBurgerLargeDrinkCosts7() throws Exception {
        MealOrder mealOrder = new MealOrder(new Burger(), DrinkOption.LARGE);

        assertThat(mealOrder.price())
            .isEqualTo(7);
    }

}
