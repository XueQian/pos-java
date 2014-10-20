package com.thoughtworks.iamcoach.pos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    PromotionCalculator promotionCalculator = new PromotionCalculator();
    public double getSubtotal(CartItem cartItem) {

        List<Double> promotionList = new ArrayList<Double>();

        if (promotionCalculator.calculateDiscount(cartItem) > 0) {
            promotionList.add(promotionCalculator.calculateDiscount(cartItem));
        }

        if (promotionCalculator.calculateOneFree(cartItem) > 0) {
            promotionList.add(promotionCalculator.calculateOneFree(cartItem));
        }

        if (promotionCalculator.calculateSecondHalf(cartItem) > 0) {
            promotionList.add(promotionCalculator.calculateSecondHalf(cartItem));
        }

        return Collections.min(promotionList);
    }
    
}
