package ru.arnis.designpatterns.Observer_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyall();
}
