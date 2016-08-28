package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public interface Direction {

    void execute();
    void undo();
}
