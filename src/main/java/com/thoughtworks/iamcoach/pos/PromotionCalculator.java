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

    public double calculateSecondHalf(CartItem cartItem) {
        double secondHalfMoney = cartItem.getCount()*cartItem.getItem().getPrice() - (int)(cartItem.getCount()/3)*cartItem.getItem().getPrice()/2;
        return secondHalfMoney;
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

    public boolean hasExistDiscount(CartItem cartItem) {
        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> discountCartItems = promotionProcessor.discountProcess();
        for (Promotion discountCartItem : discountCartItems){
            if(discountCartItem.getBarcode().equals(cartItem.getItem().getBarcode())){
                return true;
            }
        }
        return false;
    }

    public boolean hasExistOneFree(CartItem cartItem) {
        return true;
    }
}
