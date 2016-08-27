package ru.arnis.designpatterns.Prototype_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class CloneFactory {
    public static Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
