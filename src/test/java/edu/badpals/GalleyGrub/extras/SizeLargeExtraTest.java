package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.order.Comanda;
import edu.badpals.GalleyGrub.order.Order;
import edu.badpals.GalleyGrub.receipt.Receipt;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SizeLargeExtraTest{
    static Receipt receipt;
    static Extra sizeL;
    static Order order;

    @BeforeClass
    public static void setup_receipt() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium");
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");
        order.addItem("Coral Bits", 1.00, "large");

        receipt = new Receipt(order);

        sizeL = new SizeLargeExtra();
        receipt.setChain(sizeL);
    }

    @Test
    public void sum_extras_cheese_test() {

        sizeL.sumExtras(order);
        assertEquals(1.00d, order.getTotal(), 0.1d);
    }

}