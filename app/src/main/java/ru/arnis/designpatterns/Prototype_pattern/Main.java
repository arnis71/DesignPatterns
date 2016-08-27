package ru.arnis.designpatterns.Prototype_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Animal rabbit1 = new Rabbit("mikey");
        Animal rabbit2 = CloneFactory.getClone(rabbit1);
        System.out.println("first ship hash "+rabbit1.hashCode());
        System.out.println("second ship hash "+rabbit2.hashCode());
    }
}
