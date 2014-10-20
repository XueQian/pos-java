package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;


public class PromotionCalculatorTest {

    @Test
    public void should_return_a_lowest_promotion(){
        PromotionCalculator promotionCalculator = new PromotionCalculator();
        Item item = new Item("ITEM000005","鸡翅",55,"块");
        CartItem cartItem = new CartItem(item,2);

    }


}
