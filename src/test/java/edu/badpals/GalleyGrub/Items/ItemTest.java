package edu.badpals.GalleyGrub.Items;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testEquals() {

        Item patty = new Item("Krabby Patty", 1.25);
        Item kpatty = new Item("Krabby Patty", 1.25);
        assertTrue(patty.equals(kpatty));

    }

}