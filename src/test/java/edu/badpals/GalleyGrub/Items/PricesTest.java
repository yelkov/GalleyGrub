package edu.badpals.GalleyGrub.Items;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PricesTest {
    @Test
    public void pricesTest(){
        Prices.init_prices();
        assertEquals(4,Prices.prices.size());
    }
}
