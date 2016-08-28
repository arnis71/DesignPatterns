package ru.arnis.designpatterns.Decorator_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public interface Order {
    void addEntry(String entry);
    int getTotalPrice();
}
