package com.example.svwa.entities.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceHelperTest {

    @Test
    public void getQualityValueBaseTest() {
        assertEquals(100, PriceHelper.getQualityValue(Qualities.BASE, 100));
    }

    @Test
    public void getQualityValueSilverTest() {
        assertEquals(125, PriceHelper.getQualityValue(Qualities.SILVER, 100));
    }

    @Test
    public void getQualityValueGoldTest() {
        assertEquals(150, PriceHelper.getQualityValue(Qualities.GOLD, 100));
    }

    @Test
    public void getQualityValueIridiumTest() {
        assertEquals(200, PriceHelper.getQualityValue(Qualities.IRIDIUM, 100));
    }
}