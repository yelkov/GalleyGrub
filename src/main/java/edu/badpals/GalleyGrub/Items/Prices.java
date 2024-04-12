package edu.badpals.GalleyGrub.Items;

import java.util.HashMap;
import java.util.Map;



public class Prices {
    static Map<String, Double> prices = new HashMap<>();

    private Prices() {
    }

    public static void init_prices() {
        prices.put("cheese",0.25);
        prices.put("sauce",0.50);
        prices.put("medium",0.25);
        prices.put("large",0.50);
    }

    public static void display() {

        for (Map.Entry<String,Double> entry : prices.entrySet()){
            System.out.println("\t" + entry);
        }

    }
    public static boolean contains(String extra){
        return prices.containsKey(extra);
    }
    public static Double getPrice(String extra){
        return prices.get(extra);
    }
}
