package com.smartwarehouse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WarehouseTesting {
    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    @BeforeEach
    void setUpList(){
        electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Mobile"));
        electronicsStorage.addItem(new Electronics("Tablet"));

        groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Wheat"));

        furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Bed"));
    }

    @Test
    void testElectronics(){
        Assertions.assertEquals(2, electronicsStorage.getAll().size());
        Assertions.assertEquals("Mobile", electronicsStorage.getItem(0).toString());
    }

    @Test
    void testFurniture(){
        Assertions.assertEquals(2,furnitureStorage.getAll().size());
        Assertions.assertEquals("Bed", furnitureStorage.getItem(1).toString());
    }

    @Test
    void testGrocery(){
        Assertions.assertEquals(2,groceriesStorage.getAll().size());
        Assertions.assertEquals("Wheat",groceriesStorage.getItem(1).toString());
    }
    @AfterEach
    void after(){
        System.out.println("Passed !!");
    }

}
