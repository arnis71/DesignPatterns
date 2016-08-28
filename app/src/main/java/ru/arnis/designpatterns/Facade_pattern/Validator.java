package ru.arnis.designpatterns.Facade_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Validator {
    int valueToValidate = 123;

    public boolean checkValid(int value){
        if (valueToValidate==value)
            return true;
        else return false;
    }
}
