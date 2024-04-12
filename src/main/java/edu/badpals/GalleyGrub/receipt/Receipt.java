package edu.badpals.GalleyGrub.receipt;

import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.order.Comanda;

import java.util.List;

public class Receipt implements Ticket{
    private Comanda order = null;
    public Receipt(Comanda order){
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        List<Product> items = this.order.itemList();
        Double total = 0d;
        for (Product item : items){
            total += item.price();
        }
        return total;
    }

    @Override
    public void sumExtrasCharge() {

    }

    @Override
    public void print() {
        this.order.display();
        StringBuilder sb = new StringBuilder();
        sb.append("\tTOTAL --------> ").append(String.format("%.2f",total())).append("$");
        System.out.println(sb);

    }
}
