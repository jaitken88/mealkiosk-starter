package com.welltestedlearning.mealkiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MealBuilder {

    private List<BurgerTopping> burgerToppingList = new ArrayList<>();

    public void addBurgerString(String burgerOrderText) {
        Scanner scanner = new Scanner(burgerOrderText);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            String item;
            item = scanner.next();
            if (!item.equalsIgnoreCase("none")) {
                burgerToppingList.add(returnToppingEnum(item));
            }
        }
    }

    public BurgerTopping returnToppingEnum(String topping) {
        switch (topping.toLowerCase()) {
            case "cheese":
                return BurgerTopping.CHEESE;
            case "bacon":
                return BurgerTopping.BACON;
            case "avocado":
                return BurgerTopping.AVOCADO;
            default:
                throw new IllegalStateException("Unexpected value: " + topping.toLowerCase());
        }
    }

    public MealOrder build() {
        MealOrder mealOrder = new MealOrder();

        Burger burger = new Burger();
        for (BurgerTopping burgerTopping : burgerToppingList) {
            burger.addTopping(burgerTopping);
        }

        mealOrder.addItem(burger);
        return mealOrder;
    }
}
