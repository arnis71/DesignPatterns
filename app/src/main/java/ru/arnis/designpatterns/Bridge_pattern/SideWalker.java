package ru.arnis.designpatterns.Bridge_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class SideWalker extends Direction {
    public SideWalker(WalkingInterface walkingInterface) {
        super(walkingInterface);
    }

    @Override
    public void walk() {
        walkingInterface.walk();
    }

    @Override
    public void changeDir() {
        System.out.println("changed direction");
    }
}
