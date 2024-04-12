package edu.badpals.GalleyGrub.receipt;

import edu.badpals.GalleyGrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    //void setChain(Extra extra);
    //Extra getChain();
    Double total();
    void sumExtrasCharge();
    void print();
}
