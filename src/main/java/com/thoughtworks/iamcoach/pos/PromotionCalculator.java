package com.thoughtworks.iamcoach.pos;

public class PromotionCalculator {

    public Double calculateOneFree(CartItem cartItem){
        return 0.0;
    }

    public double calculateDiscount(CartItem cartItem) {
        double discountMoney = cartItem.getItem().getPrice()*cartItem.getCount();
        return discountMoney;
    }
}
