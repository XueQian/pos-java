package com.thoughtworks.iamcoach.pos;

import java.util.List;

public class PromotionCalculator {

    public double calculateOneFree(CartItem cartItem){
        double oneFreeMoney = ((int)(cartItem.getCount()/3)*2 + cartItem.getCount()%3) * cartItem.getItem().getPrice();
        return oneFreeMoney;
    }

    public double calculateDiscount(CartItem cartItem) {
        double basicMoney = cartItem.getItem().getPrice() * cartItem.getCount();
        double discountMoney = basicMoney * getDiscount(cartItem.getItem().getBarcode());
        return discountMoney;
    }

    private double getDiscount(String barcode){
        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> discountList = promotionProcessor.discountProcess();
        for(Promotion aDiscountList : discountList){

            if(barcode.equals(aDiscountList.getBarcode())){
                return aDiscountList.getDiscount()/100;
            }
        }
        return 0.0;
    }
}
