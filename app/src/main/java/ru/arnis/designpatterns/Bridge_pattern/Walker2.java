package ru.arnis.designpatterns.Bridge_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Walker2 implements WalkingInterface{
    @Override
    public void walk() {
        System.out.println("Walking 2");
    }
}
