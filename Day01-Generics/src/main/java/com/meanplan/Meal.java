package com.meanplan;

public class Meal<T extends MealPlan>{
    String mealName;
    T mealType;

    public String getMealName() {
        return mealName;
    }

    public T getMealType() {
        return mealType;
    }

    public Meal(String mealName, T mealType) {
        this.mealName = mealName;
        this.mealType = mealType;
    }
    public String getMealDetails(){
        return "Meal name: "+mealName+" | meal type: "+mealType.getPlanDetail();
    }
}
