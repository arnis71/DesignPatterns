package ru.arnis.designpatterns.AbstractFactory_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class TimeOfMeal implements MakeMeal {
    @Override
    public Meal prepareMeal(String type) {
        Meal meal;
        switch (type){
            case "breakfast":
                Types types = new BreakFast();
                meal = new Meal(types);break;
            default: meal = null;
        }

        return meal;
    }
}
