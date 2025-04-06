package com.onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product<?>> productList = new ArrayList<>();

        Product<BookCategory> book = new Product<>("CPP", BookCategory.SCIENCE,1000);
        Product<ClothingCategory> tshirt = new Product<>("T-Shirt",ClothingCategory.MEN,400);
        Product<GadgetCategory> phone = new Product<>("Iphone",GadgetCategory.MOBILE,40000);


        productList.add(book);
        productList.add(tshirt);
        productList.add(phone);

        Discount.applyDiscount(phone,10);
        System.out.println(productList);

    }
}
