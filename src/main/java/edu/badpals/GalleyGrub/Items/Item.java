package edu.badpals.GalleyGrub.Items;

import java.util.Objects;

public class Item implements Product {
    String name = "";
    Double price = 0d;
    String extra = "";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public Double price() {
        return null;
    }

    @Override
    public String extra() {
        return null;
    }

    @Override
    public Boolean isRegular() {
        return null;
    }

    @Override
    public String toString() {
          StringBuilder sb = new StringBuilder();
                sb.append(this.name)
                        .append("....")
                        .append(String.format("%.2f",this.price))
                        .append("$");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price) && Objects.equals(extra, item.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
