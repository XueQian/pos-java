package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class CartItemProcessorTest {

    @Test
    public void should_return_a_cart_list(){

        CartProcessor cartProcessor = new CartProcessor();
        assertThat(cartProcessor.process().get(0).getCount()).isEqualTo(2);
        assertThat(cartProcessor.process().get(1).getCount()).isEqualTo(3);
    }
}