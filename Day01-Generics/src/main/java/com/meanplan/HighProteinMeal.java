package com.meanplan;

public class HighProteinMeal implements MealPlan{
    private int proteinContent;

    public HighProteinMeal( int proteinContent) {

        this.proteinContent = proteinContent;
    }

    public void print(){
        System.out.println("gsgasgd");
    }
    public int getProteinContent() {
        return proteinContent;
    }

    @Override
    public String getPlanDetail() {
        return "High Protein meal plan";
    }
}
