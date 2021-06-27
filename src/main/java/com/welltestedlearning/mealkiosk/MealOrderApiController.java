package com.welltestedlearning.mealkiosk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealOrderApiController {

    @GetMapping("/api/mealorder")
    public String mealOrder(@RequestParam("burger") String burgerOrderText) {
        return "Your order: " + burgerOrderText;
    }
}
