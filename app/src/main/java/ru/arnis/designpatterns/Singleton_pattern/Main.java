package ru.arnis.designpatterns.Singleton_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("first "+singleton.hashCode());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("second "+singleton1.hashCode());
    }
}
