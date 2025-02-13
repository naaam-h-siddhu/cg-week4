package com.shoppingcart;

import java.util.*;
public class Cart {


    HashMap<String, Double> product = new HashMap<>();
    HashMap<String, Double> orderedProduct = new LinkedHashMap<>();
    TreeMap<Double, String> sortedProduct = new TreeMap<>();

    public void addProduct(String name, double price) {
        product.put(name, price);

        //add in linked hash map
        orderedProduct.put(name, product.get(name));

        //add in tree map
        sortedProduct.put(price, name);
    }

    public void displayUsingHm() {
        for (Map.Entry<String, Double> entry : product.entrySet()) {
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }
    }

    public void displayUsingLHm() {
        for (Map.Entry<String, Double> entry : orderedProduct.entrySet()) {
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }
    }

    public void displayUsingTm() {
        for (Map.Entry<Double, String> entry : sortedProduct.entrySet()) {
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }

    }
}
