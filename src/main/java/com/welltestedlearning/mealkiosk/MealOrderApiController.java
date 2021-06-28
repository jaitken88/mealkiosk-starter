package com.welltestedlearning.mealkiosk;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealOrderApiController {

    @GetMapping("/api/mealorder")
    public String mealOrder(@RequestParam("burger") String burgerOrderText) {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.addBurgerString(burgerOrderText);

        MealOrder mealOrder = mealBuilder.build();
        return "Your order: " + mealOrder;
    }
    @PostMapping(value = "/api/mealorder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MealOrderResponse mealOrder(@RequestBody MealOrderRequest mealOrderRequest) {
        // extract the burger text from mealOrderRequest
        String request = mealOrderRequest.getBurger();


        // create a meal order using the MealBuilder
        // Take a look at MealBuilderTest for examples
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.addBurgerString(request);
        MealOrder mealOrder = mealBuilder.build();

        int price = mealOrder.price(); // where do we get the price from?

        //-- Return

        MealOrderResponse mealOrderResponse = new MealOrderResponse();
        // set the price to the price from the mealOrder
        mealOrderResponse.setPrice(price); // where do you get the price from?

        return mealOrderResponse;
    }
}
