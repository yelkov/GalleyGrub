package edu.badpals.GalleyGrub.extras;

import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.order.Comanda;

public class Regular extends Extra {
    public Regular() {}
    @Override
    public void sumExtras(Comanda order) {
        Double total = 0d;
        for (Product item : order.itemList()) {
            total += item.price();
        }
        order.updateTotal(total);
        if (this.nextExtra.isPresent()) {
            nextExtra.get().sumExtras(order);
        }
    }
}