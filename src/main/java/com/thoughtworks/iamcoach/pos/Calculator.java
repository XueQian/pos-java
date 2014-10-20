package com.thoughtworks.iamcoach.pos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public double getSubtotal(CartItem cartItem) {

        PromotionCalculator promotionCalculator = new PromotionCalculator();

        double discountPrice = promotionCalculator.calculateDiscount(cartItem);
        double oneFreePrice = promotionCalculator.calculateOneFree(cartItem);
        double secondHalfPrice = promotionCalculator.calculateSecondHalf(cartItem);

        List<Double> promotionList = new ArrayList<Double>();

        if (discountPrice > 0) {
            promotionList.add(discountPrice);
        }

        if (oneFreePrice > 0) {
            promotionList.add(oneFreePrice);
        }

        if (secondHalfPrice > 0) {
            promotionList.add(secondHalfPrice);
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
