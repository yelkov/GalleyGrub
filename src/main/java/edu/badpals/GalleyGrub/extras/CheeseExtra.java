package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.Items.Prices;
import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.order.Comanda;

import javax.swing.plaf.basic.BasicMenuUI;

public class CheeseExtra extends Extra{
    private Double CHEESE_PRICE = Prices.getPrice(CHEESE);
    @Override
    public void sumExtras(Comanda order) {
        Double cheesesCost = 0d;
        for (Product item : order.itemList()){
            if (item.extra() == CHEESE){
                cheesesCost += CHEESE_PRICE;
            }
        }
        order.updateTotal(cheesesCost);
        if (this.nextExtra.isPresent()){
            nextExtra.get().sumExtras(order);
        }
    }
}
