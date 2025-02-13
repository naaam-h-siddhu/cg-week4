package com.shoppingcart;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Add 10 products with their prices
        cart.addProduct("Laptop", 999.99);
        cart.addProduct("Smartphone", 699.49);
        cart.addProduct("Headphones", 59.99);
        cart.addProduct("Tablet", 399.99);
        cart.addProduct("Smartwatch", 199.99);
        cart.addProduct("Monitor", 229.99);
        cart.addProduct("Keyboard", 49.99);
        cart.addProduct("Mouse", 25.99);
        cart.addProduct("Charger", 15.49);
        cart.addProduct("External Hard Drive", 89.99);


        //display in any order using hashmap
        System.out.println("using hashmap");
        cart.displayUsingHm();
        System.out.println("---------");
        System.out.println("using linked Hm");
        //display using linkedHM order
        cart.displayUsingLHm();
        System.out.println("----------");
        System.out.println("using treeMap");
        //display using tree map sorted
        cart.displayUsingTm();
    }
}
