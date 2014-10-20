package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_a_lowest_promotion() {

       Calculator calculator = new Calculator();

        Item item = new Item("ITEM000005", "鸡翅", 10, "块");
        CartItem cartItem = new CartItem(item, 5);
        assertThat(calculator.getSubtotal(cartItem)).isEqualTo(40.0);

    }

}

