package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.order.Comanda;

public class SauceExtra extends Extra{
    private Double SAUCE_PRICE = Prices.getPrice(SAUCE);
    @Override
    public void sumExtras(Comanda order) {
        Double saucesCost = 0d;
        for (Product item : order.itemList()) {
            if (item.extra() == SAUCE) {
                saucesCost += SAUCE_PRICE;
            }
        }
        order.updateTotal(saucesCost);
        if (this.nextExtra.isPresent()) {
            nextExtra.get().sumExtras(order);
        }
    }
}
