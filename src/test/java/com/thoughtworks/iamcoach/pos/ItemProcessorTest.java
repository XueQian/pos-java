package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemProcessorTest {

    @Test
    public void should_return_an_item_list(){
        ItemProcessor itemProcessor = mock(ItemProcessor.class);
        List<Item> items = new ArrayList<Item>();
        items.add(0, new Item("ITEM000001", "可乐", 11, "瓶"));
        when(itemProcessor.process()).thenReturn(items);
        assertThat(itemProcessor.process().get(0).getName()).isEqualTo("可乐");


    }
}

