package ru.arnis.designpatterns.Bridge_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public abstract class Direction {

    WalkingInterface walkingInterface;

    public Direction(WalkingInterface walkingInterface) {
        this.walkingInterface = walkingInterface;
    }

    abstract void walk();
    abstract void changeDir();
}
