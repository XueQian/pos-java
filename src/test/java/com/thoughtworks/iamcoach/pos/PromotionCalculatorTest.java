package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class PromotionCalculatorTest {

    @Test
    public void should_return_a_lowest_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();

    }

    @Test
    public void should_return_total_money_with_a_discount_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000005","鸡翅",55,"块");
        CartItem cartItem = new CartItem(item,2);
        assertThat(promotionCalculator.calculateDiscount(cartItem)).isEqualTo(110.0);
    }

    @Test
    public void should_return_total_money_with_a_one_free_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000005","鸡翅",55,"块");
        CartItem cartItem = new CartItem(item,2);
        assertThat(promotionCalculator.calculateOneFree(cartItem)).isEqualTo(0.0);
    }


}
