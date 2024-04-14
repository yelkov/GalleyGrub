package edu.badpals.GalleyGrub.receipt;


import edu.badpals.GalleyGrub.extras.*;
import edu.badpals.GalleyGrub.order.Comanda;
import edu.badpals.GalleyGrub.order.Order;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ReceiptTest {

    Receipt receipt;
    Order order;
    Extra cheese;

    @Before
    public void setup_receipt() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium"); // si definir medium
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");
        order.addItem("Coral Bits", 1.00, "large");

        receipt = new Receipt(order);
    }

    // integracion receipt con un Extra
    @Test
    public void sum_extra_cheese_test() {

        cheese = new CheeseExtra();
        receipt.setChain(cheese);
        assertNotNull(receipt.getChain());

        Comanda savedOrder = receipt.getOrder();
        assertNotNull(savedOrder);
        assertEquals(0d, savedOrder.getTotal(), 0d);

        receipt.sumExtrasCharge();
        assertEquals(0.25d, receipt.getOrder().getTotal(), 0d);
    }

    // integracion receipt con tres Extra
    @Test
    public void chain_test() {

        cheese = new CheeseExtra();
        Extra sauce = new SauceExtra();
        Extra size = new SizeLargeExtra();

        cheese.setNextExtra(sauce);
        sauce.setNextExtra(size);

        receipt.setChain(cheese);
        assertNotNull(receipt.getChain());

        receipt.sumExtrasCharge();
        assertEquals(2.25d, receipt.getOrder().getTotal(), 0d);
    }

    // Total con regular y extras
    @Test
    public void total_w_extra_test() {

        cheese = new CheeseExtra();
        Extra sauce = new SauceExtra();
        Extra size = new SizeLargeExtra();

        Regular regular = new Regular();
        regular.setNextExtra(cheese);
        cheese.setNextExtra(sauce);
        sauce.setNextExtra(size);

        receipt.setChain(regular);
        assertNotNull(receipt.getChain());

        assertEquals(10.0d , receipt.total(), 0.1);
    }
}
