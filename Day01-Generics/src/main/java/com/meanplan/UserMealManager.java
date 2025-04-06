package com.meanplan;

import java.util.HashMap;

public class UserMealManager {
    private HashMap<User, Meal<? extends MealPlan>> users= new HashMap<>();

    public void setUsers(User user, Meal<? extends MealPlan> meal) {

        if(users.containsKey(user)){
            System.out.println(user.getName()+" already in the database");
        }
        else{
            users.put(user,meal);
            System.out.println(user.getName()+" successfully added to the database");
        }
    }

    public HashMap<User, Meal<? extends MealPlan>> getUsers() {
        return users;
    }

    //    private String getUserMeal(User user){
//        if(users.containsKey(user)){
//            return "USER DOESN'T EXISTS";
//        }
//        return users.get(user).getMealDetails();
//    }
    public void getAllDetails(){
        for(User user: users.keySet()){
            System.out.println("UserName : "+ user.toString()+"\n Meal details: "+users.get(user).getMealDetails());
            System.out.println();
        }
    }
}
