package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CartProcessorTest {

    @Test
    public void should_return_a_cart_list(){

        CartProcessor cartProcessor = mock(CartProcessor.class);
        List<Cart> carts = new ArrayList<Cart>();
        carts.add(0,new Cart("ITEM000001",1));

        when(cartProcessor.process()).thenReturn(carts);
        assertThat(cartProcessor.process().get(0).getBarcode()).isEqualTo("ITEM000001");
    }
}
