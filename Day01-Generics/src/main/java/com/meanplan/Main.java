package com.meanplan;

public class Main {
    public static void main(String[] args) {
        UserMealManager userMealManager = new UserMealManager();

        User siddhu = new User("Siddhu singh", 90, 22);
        User nitish = new User("Nitish Kumar Singh", 77,22);
        User karan = new User("Karan Kumar", 65,25);

        userMealManager.setUsers(siddhu,new Meal<>("Chicken",new HighProteinMeal(100)));
        userMealManager.setUsers(nitish,new Meal<>("Paneer",new VegetarianMean(false)));
        userMealManager.setUsers(karan,new Meal<>("Tez Patta", new VeganMeal()));

        userMealManager.getAllDetails();
    }
}
