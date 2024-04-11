package edu.badpals.GalleyGrub.Items;

import java.util.HashMap;
import java.util.Map;



public class Prices {
    static Map<String, Double> prices = new HashMap<>();

    public Prices() {
    }

    public static void init_prices() {
        prices.put("cheese",0.25);
        prices.put("sauce",0.50);
        prices.put("medium",0.25);
        prices.put("large",0.50);
    }

    public static void display() {

        for (Map.Entry<String,Double> entry : prices.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue().toString());
        }
    }
}
