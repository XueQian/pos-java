package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PromotionProcessorTest {

    @Test
    public void should_return_an_promotion_object_with_one_parament(){
        PromotionProcessor promotionProcessor = mock(PromotionProcessor.class);
        List<Promotion> promotions = new ArrayList<Promotion>();
        promotions.add(0,new Promotion("IE00000"));
        when(promotionProcessor.halfProcess()).thenReturn(promotions);
        assertThat(promotionProcessor.halfProcess()).isEqualTo(promotions);

    }

    @Test
    public void should_return_an_promotion_object_with_two_parament(){
        PromotionProcessor promotionProcessor = mock(PromotionProcessor.class);
        List<Promotion> promotions = new ArrayList<Promotion>();
        promotions.add(0,new Promotion("IE00000",80));
        when(promotionProcessor.discountProcess()).thenReturn(promotions);
        assertThat(promotionProcessor.discountProcess()).isEqualTo(promotions);

    }


}
