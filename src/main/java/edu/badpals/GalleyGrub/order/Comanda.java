package edu.badpals.GalleyGrub.order;

import edu.badpals.GalleyGrub.Items.Item;
import edu.badpals.GalleyGrub.Items.Product;

import java.util.List;

public interface Comanda {
    void addItem(String name, Double price);
    void addItem(String name, Double price, String extra);
    int size();
    List<Product> itemList();
    Double getTotal();
    void updateTotal(Double total);
    void display();

}
