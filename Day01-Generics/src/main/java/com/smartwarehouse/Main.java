package com.smartwarehouse;

import java.util.List;


public class Main {
    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items)
            System.out.println(item);
    }
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Mobile"));
        electronicsStorage.addItem(new Electronics("Tablet"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Wheat"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Bed"));

        System.out.println("List of Electronic items: ");
        displayItems(electronicsStorage.getAll());


        System.out.println("List of Grocery items: ");
        displayItems(furnitureStorage.getAll());

        System.out.println("List of Furniture items: ");
        displayItems(groceriesStorage.getAll());
    }
}
