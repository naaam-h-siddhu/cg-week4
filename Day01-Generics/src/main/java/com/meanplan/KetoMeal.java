package com.meanplan;

public class KetoMeal implements MealPlan{
    private int fastingHour;


    public KetoMeal( int fastingHour) {
        this.fastingHour = fastingHour;
    }


    public int getFastingHour() {
        return fastingHour;
    }

    @Override
    public String getPlanDetail() {
        return "Keto diet meal plan";

    }
}
