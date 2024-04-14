package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.order.Comanda;

public class SizeLargeExtra extends Extra{
    private Double SIZE_PRICE = Prices.getPrice(SIZE_LARGE);
    @Override
    public void sumExtras(Comanda order) {
        Double largesCost = 0d;
        for(Product item : order.itemList()){
            if (item.extra() == SIZE_LARGE){
                largesCost += SIZE_PRICE;
            }
        }
        order.updateTotal(largesCost);
        if (this.nextExtra.isPresent()) {
            nextExtra.get().sumExtras(order);
        }
    }
}
