package ru.arnis.designpatterns.AbstractFactory_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class BreakFast implements Types {

    @Override
    public Starter addStarter() {
        return new Starter();
    }

    @Override
    public Entre addEntre() {
        return null;
    }

    @Override
    public Desert addDesert() {
        return null;
    }
}
