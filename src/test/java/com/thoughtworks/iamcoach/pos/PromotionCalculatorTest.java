package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;


public class PromotionCalculatorTest {
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

    @Test
    public void should_return_a_lowest_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();

    }

    @Test
    public void should_return_total_money_with_a_discount_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000005","鸡翅",55,"块");
        CartItem cartItem = new CartItem(item,2);
        assertThat(promotionCalculator.calculateDiscount(cartItem)).isEqualTo(99.0);
    }

    @Test
    public void should_return_discount(){
        assertThat(getDiscount("ITEM000005")).isEqualTo(0.9);
    }

    @Test
    public void should_return_total_money_with_a_one_free_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000005","鸡翅",55,"块");
        CartItem cartItem = new CartItem(item,2);
        assertThat(promotionCalculator.calculateOneFree(cartItem)).isEqualTo(0.0);
    }


}
