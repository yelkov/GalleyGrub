package edu.badpals.GalleyGrub.receipt;

import com.sun.org.apache.xpath.internal.operations.Or;
import edu.badpals.GalleyGrub.order.Comanda;
import edu.badpals.GalleyGrub.order.Order;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class ReceiptTest {

    @Test
    public void test_total() {
        Comanda order = new Order();
        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        Ticket receipt = new Receipt(order);
        Double expectedPrice = 5.75d;
        assertEquals(expectedPrice, receipt.total());
    }
}