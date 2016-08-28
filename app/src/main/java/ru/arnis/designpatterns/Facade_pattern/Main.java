package ru.arnis.designpatterns.Facade_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doAction(12);
    }
}
