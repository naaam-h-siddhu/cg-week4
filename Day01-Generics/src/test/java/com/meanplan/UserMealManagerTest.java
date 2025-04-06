package com.meanplan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMealManagerTest {
    private UserMealManager userMealManager;
    User siddhu = new User("Siddhu singh", 90, 22);
    User nitish = new User("Nitish Kumar Singh", 77,22);
    User karan = new User("Karan Kumar", 65,25);
    @BeforeEach
    void setUserMealManager(){
        userMealManager = new UserMealManager();

//        User siddhu = new User("Siddhu singh", 90, 22);
//        User nitish = new User("Nitish Kumar Singh", 77,22);
//        User karan = new User("Karan Kumar", 65,25);
        userMealManager.setUsers(siddhu,new Meal<>("Chicken",new HighProteinMeal(100)));
        userMealManager.setUsers(nitish,new Meal<>("Paneer",new VegetarianMean(false)));
        userMealManager.setUsers(karan,new Meal<>("Tez Patta", new VeganMeal()));

    }

    @Test
    void testProteinContent(){


        HighProteinMeal hm = (HighProteinMeal) userMealManager.getUsers().get(siddhu).getMealType();
        Assertions.assertEquals(100, hm.getProteinContent());
    }
    @Test
    void testNumberOfUser(){
        assertEquals(3, userMealManager.getUsers().size());
    }

}