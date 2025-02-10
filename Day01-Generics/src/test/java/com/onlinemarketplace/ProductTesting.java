package com.onlinemarketplace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class ProductTesting {
    private List<Product<?>> productList;
    @BeforeEach
    void setUp(){
        productList = new ArrayList<>();

        Product<BookCategory> bookCategoryProduct  = new Product<>("CPP", BookCategory.SCIENCE, 1000);
        Product<ClothingCategory> clothingCategoryProduct = new Product<>("Tshirt",ClothingCategory.MEN,500);
        Product<GadgetCategory> gadgetCategoryProduct = new Product<>("Samsung s24u",GadgetCategory.MOBILE,100000);

        productList.add(bookCategoryProduct);
        productList.add(clothingCategoryProduct);
        productList.add(gadgetCategoryProduct);

        Discount.applyDiscount(gadgetCategoryProduct,10.0);
    }

    @Test
    void testBook(){

        Assertions.assertEquals("science", productList.get(0).getCategory().toString().toLowerCase());
    }

    @Test
    void testClothe(){
        Assertions.assertEquals("tshirt",productList.get(1).getName().toString().toLowerCase());
    }
    @Test
    void testDiscount(){
        Assertions.assertEquals(90000.0,productList.getLast().getPrice());
    }
}

