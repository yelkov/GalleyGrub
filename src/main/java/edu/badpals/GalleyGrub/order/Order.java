package edu.badpals.GalleyGrub.order;

import edu.badpals.GalleyGrub.Items.Item;
import edu.badpals.GalleyGrub.Items.ItemFactory;
import edu.badpals.GalleyGrub.Items.Product;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    private Double total = 0d;
    List<Product> items = new ArrayList<>();
    public Order(){

    }

    @Override
    public void addItem(String name, Double price) {
        Product item = ItemFactory.getItem(name,price);
        items.add(item);
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        Product item = ItemFactory.getItem(name,price,extra);
        items.add(item);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Product> itemList() {
        return this.items;
    }

    @Override
    public Double getTotal() {
        return null;
    }

    @Override
    public void updateTotal(Double total) {

    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t").append("--- ORDER ---");
        for (Product item : itemList()){
            sb.append("\n\t")
                    .append(item.toString());
        }
        System.out.println(sb.toString());

    }
}
