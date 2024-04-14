package edu.badpals.GalleyGrub.order;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void test_addItem() {
        Comanda order = new Order();
        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        assertEquals(4,order.size());
    }

    @Test
    public void test_addItemExtra() {
        Comanda order = new Order();
        order.addItem("Krabby Patty", 1.25,"cheese");
        order.addItem("Coral Bits", 1.00,"medium");
        order.addItem("Kelp Rings", 1.50,"sauce");
        order.addItem("Golden Loaf", 2.00,"large");
        assertEquals(4,order.size());
    }


}