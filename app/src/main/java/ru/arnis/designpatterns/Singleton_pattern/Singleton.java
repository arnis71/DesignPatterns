package ru.arnis.designpatterns.Singleton_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance==null)
            instance = new Singleton();

        return instance;
    }
}
