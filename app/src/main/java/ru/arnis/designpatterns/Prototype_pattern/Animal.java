package ru.arnis.designpatterns.Prototype_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public abstract class Animal implements Cloneable {
    protected String type;
    protected String name;

    public abstract Animal makeCopy();
}
