package edu.badpals.GalleyGrub.Items;

import org.junit.Test;

import static org.junit.Assert.*;

public class PricesTest {
    @Test
    public void pricesNameTest(){
        assertTrue(Prices.contains("cheese"));
        assertTrue(Prices.contains("sauce"));
        assertTrue(Prices.contains("medium"));
        assertTrue(Prices.contains("large"));
        assertFalse(Prices.contains("sugar"));
    }

    public void pricesPriceTest(){
        assertEquals(0.25,Prices.getPrice("cheese"),0.1);
        assertEquals(0.5,Prices.getPrice("large"),0.1);
    }
}
