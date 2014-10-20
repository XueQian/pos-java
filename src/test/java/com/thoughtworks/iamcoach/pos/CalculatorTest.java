package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_a_lowest_promotion() {

        Calculator calculator = new Calculator();

        Item item = new Item("ITEM000005", "鸡翅", 10, "块");
        CartItem cartItem = new CartItem(item, 5);
        assertThat(calculator.getSubtotal(cartItem)).isEqualTo(40.0);
    }

    @Test
    public void should_return_total_money_before_promot() {

        Calculator calculator = new Calculator();

        List<CartItem> cartItemList = new ArrayList<CartItem>();
        cartItemList.add(new CartItem(new Item("ITEM000001","可乐",11,"瓶"),10));
        cartItemList.add(new CartItem(new Item("ITEM000002","雪碧",22,"瓶"),10));
        cartItemList.add(new CartItem(new Item("ITEM000003","苹果",33,"个"),10));

        assertThat(calculator.getTotalMoney()).isEqualTo(660);

    }

}

