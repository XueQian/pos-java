package com.thoughtworks.iamcoach.pos;

import java.util.List;

public class PromotionCalculator {

    private double calculateOneFree(CartItem cartItem) {

        double oneFreeMoney = 0.0;

        if (hasExistOneFree(cartItem)) {
            oneFreeMoney = ((int) (cartItem.getCount() / 3) * 2 + cartItem.getCount() % 3) * cartItem.getItem().getPrice();
        }
        return oneFreeMoney;
    }

    private double calculateDiscount(CartItem cartItem) {

        double discountMoney = 0.0;

        if (hasExistDiscount(cartItem)) {
            double basicMoney = cartItem.getItem().getPrice() * cartItem.getCount();
            discountMoney = basicMoney * getDiscount(cartItem.getItem().getBarcode());
        }
        return discountMoney;
    }

    private double calculateSecondHalf(CartItem cartItem) {

        double secondHalfMoney = 0.0;

        if (hasExistSecondHalf(cartItem)) {
            secondHalfMoney = cartItem.getCount() * cartItem.getItem().getPrice() - (int) (cartItem.getCount() / 3) * cartItem.getItem().getPrice() / 2;
        }
        return secondHalfMoney;
    }

    private double getDiscount(String barcode) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> discountList = promotionProcessor.discountProcess();

        for (Promotion aDiscountList : discountList) {

            if (barcode.equals(aDiscountList.getBarcode())) {
                return aDiscountList.getDiscount() / 100;
            }
        }
        return 0.0;
    }

    private boolean hasExistDiscount(CartItem cartItem) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> discountCartItems = promotionProcessor.discountProcess();

        for (Promotion discountCartItem : discountCartItems) {
            if (discountCartItem.getBarcode().equals(cartItem.getItem().getBarcode())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasExistOneFree(CartItem cartItem) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> oneFreeCartItems = promotionProcessor.freeProcess();

        for (Promotion oneFreeCartItem : oneFreeCartItems) {
            if (oneFreeCartItem.getBarcode().equals(cartItem.getItem().getBarcode())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasExistSecondHalf(CartItem cartItem) {

        PromotionProcessor promotionProcessor = new PromotionProcessor();
        List<Promotion> secondHalfCartItems = promotionProcessor.halfProcess();
        
        for (Promotion secondHalfCartItem : secondHalfCartItems) {
            if (secondHalfCartItem.getBarcode().equals(cartItem.getItem().getBarcode())) {
                return true;
            }
        }
        return false;
    }
}
