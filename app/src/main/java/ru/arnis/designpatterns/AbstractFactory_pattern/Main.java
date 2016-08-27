package ru.arnis.designpatterns.AbstractFactory_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class Main {
    public static void main(String[] args) {
        MakeMeal restaurant1 = new TimeOfMeal();
        Meal meal = restaurant1.prepareMeal("breakfast");
        meal.eat();
    }
}
