package com.welltestedlearning.mealkiosk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FriesTest {

    @Test
    public void smallFriesAre3() {
        Fries fries = new Fries(Fries.REGULAR);

        assertThat(fries.price())
            .isEqualTo(3);
    }

    @Test
    public void largeFriesAre5() {
        Fries fries = new Fries(Fries.LARGE);

        assertThat(fries.price())
            .isEqualTo(5);
    }

}
