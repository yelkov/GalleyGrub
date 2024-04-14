package edu.badpals.GalleyGrub.Items;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;



public enum Prices {
    CHEESE  ("cheese",0.25),
    SAUCE   ("sauce",0.5),
    MEDIUM  ("medium",0.25),
    LARGE   ("large",0.50);

    private String name = "";
    private Double price = 0d;

    private Prices(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static void display() {
        StringBuilder sb = new StringBuilder();
        for (Prices type : Prices.values()) {
            sb.append("\t")
                    .append(type.name)
                    .append("=")
                    .append(type.price)
                    .append("\n");
        }
        System.out.println(sb.toString());
    }
    public static boolean contains(String extra){
        for (Prices type : Prices.values()){
            if (type.name == extra){
                return true;
            }
        }
        return false;
    }
    public static Double getPrice(String extra){
        for (Prices type : Prices.values()){
            if (type.name == extra){
                return type.price;
            }
        }
        return 0d;
    }
}
