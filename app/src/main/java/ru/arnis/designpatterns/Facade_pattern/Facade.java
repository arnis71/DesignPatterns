package ru.arnis.designpatterns.Facade_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Facade {
    Validator validator;

    public Facade() {
        validator = new Validator();
    }

    public void doAction(int value){
        if (validator.checkValid(value))
            System.out.println("Action done!");
        else System.out.println("Action not done!");
    }
}
