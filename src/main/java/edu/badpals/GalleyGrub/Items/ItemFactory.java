package edu.badpals.GalleyGrub.Items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static Map<String, Item> items = new HashMap<>();

    private ItemFactory(){};

    public static Item getItem(String name,double price){
        items.putIfAbsent(name,new Item(name,price));
        return items.get(name);
    }
    public static Item getItem(String name, double price, String extra){
        items.putIfAbsent(name + " w/ " + extra,new Item(name,price,extra));
        return items.get(name+" w/ "+extra);
    }
    public static void clear() {
        items.clear();
    }

    public static int size() {
        return  items.size();
    }
}
