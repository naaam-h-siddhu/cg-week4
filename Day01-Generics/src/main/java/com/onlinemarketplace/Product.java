package com.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Product<T>{
   private String name;
   private T category;
   private double price;

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", category=" + category +
                ", price=" + price +"} \n";
    }

    public Product(String name, T category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
