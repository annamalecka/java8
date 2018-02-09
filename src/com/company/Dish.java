package com.company;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;

    public Dish(String name, boolean vegetarian, int calories) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dish{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vegetarian=").append(vegetarian);
        sb.append(", calories=").append(calories);
        sb.append('}');
        return sb.toString();
    }
}
