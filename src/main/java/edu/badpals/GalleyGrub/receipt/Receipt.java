package edu.badpals.GalleyGrub.receipt;

import edu.badpals.GalleyGrub.Items.Product;
import edu.badpals.GalleyGrub.extras.Extra;
import edu.badpals.GalleyGrub.order.Comanda;

import java.util.List;

public class Receipt implements Ticket{
    private Comanda order = null;
    private Double total = 0d;
    private Extra firstExtra;
    public Receipt(Comanda order){
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return this.firstExtra;
    }

    @Override
    public Double total() {
        sumExtrasCharge();
        this.total = order.getTotal();

        return this.total;
    }

    @Override
    public void sumExtrasCharge() {
        if(!(this.firstExtra == null)) {
            firstExtra.sumExtras(this.order);
        }

    }

    @Override
    public void print() {
        this.order.display();
        StringBuilder sb = new StringBuilder();
        sb.append("\tTOTAL --------> ").append(String.format("%.2f",this.total)).append("$");
        System.out.println(sb);

    }
}
