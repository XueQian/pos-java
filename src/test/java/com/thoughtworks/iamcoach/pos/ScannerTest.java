package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ScannerTest {

    @Test
    public void should_get_item_by_barcode(){
        Scanner scanner = mock(Scanner.class);

        Item item = new Item("ITEM000001", "可乐", 11, "瓶");

        when(scanner.getItem()).thenReturn(item);
        assertThat(scanner.getItem().getBarcode()).isEqualTo("ITEM000001");
    }

}
