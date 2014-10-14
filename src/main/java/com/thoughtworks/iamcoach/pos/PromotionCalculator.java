package com.thoughtworks.iamcoach.pos;

import java.util.DoubleSummaryStatistics;

public class PromotionCalculator {

    public Double calculateOneFree(String barcode){
        ItemProcessor itemProcessor = new ItemProcessor();


        return 0.0;
    }

    public double calculateDiscount(CartItem cartItem) {
        double discountMoney = cartItem.getItem().getPrice()*cartItem.getCount();
        return discountMoney;
    }
}
