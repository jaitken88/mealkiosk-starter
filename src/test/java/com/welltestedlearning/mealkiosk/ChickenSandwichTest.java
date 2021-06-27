package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class ChickenSandwichTest {

    @Test
    public void baseChickenSandwichHasPriceOf6() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();

        assertThat(chickenSandwich.price())
            .isEqualTo(6);
    }

    @Test
    public void chickenSandwichIsSpicyByDefault() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();

        assertThat(chickenSandwich.isSpicy())
            .isTrue();
    }

    @Test
    public void chickenSandwichIsNotSpicyWhenSpecified() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich(false);

        assertThat(chickenSandwich.isSpicy())
            .isFalse();
    }

    @Test
    public void chickenSandwichWithCheeseCost7() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();
        chickenSandwich.addTopping(BurgerTopping.CHEESE);

        assertThat(chickenSandwich.price())
            .isEqualTo(7);
    }

    @Test
    public void chickenSandwichWithBaconCost8() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();
        chickenSandwich.addTopping(BurgerTopping.BACON);

        assertThat(chickenSandwich.price())
            .isEqualTo(8);
    }

    @Test
    public void chickenSandwichWithAvocadoCost9() throws Exception {
        ChickenSandwich chickenSandwich = new ChickenSandwich();
        chickenSandwich.addTopping(BurgerTopping.AVOCADO);

        assertThat(chickenSandwich.price())
            .isEqualTo(9);
    }


}
