package com.meanplan;

public class VegetarianMean implements MealPlan{
    private boolean hasEgg;

    public VegetarianMean(boolean hasEgg) {
        this.hasEgg = hasEgg;
    }

    public boolean isHasEgg() {
        return hasEgg;
    }

    @Override
    public String getPlanDetail() {
        return  "Vegetarian Meal plan";
    }
}
