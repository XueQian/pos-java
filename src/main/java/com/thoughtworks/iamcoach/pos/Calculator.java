package com.thoughtworks.iamcoach.pos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public double getSubtotal(CartItem cartItem) {

        PromotionCalculator promotionCalculator = new PromotionCalculator();

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


    public double getTotalMoney() {

        double totalMoney = 0.0;

        Scanner scanner = new Scanner();
        List<CartItem> cartItems = scanner.process();

        for (CartItem cartItem : cartItems) {

            totalMoney += cartItem.getItem().getPrice() * cartItem.getCount();
        }
        return totalMoney;
    }
}
