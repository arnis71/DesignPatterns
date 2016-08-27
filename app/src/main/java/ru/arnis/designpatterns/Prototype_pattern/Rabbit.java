package ru.arnis.designpatterns.Prototype_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Rabbit extends Animal {
    public Rabbit(String name) {
        this.name=name;
        this.type = "rabbit";
    }

    @Override
    public Animal makeCopy() {
        Rabbit rabbit;
        try {
            rabbit = (Rabbit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            rabbit=null;
        }
        return rabbit;
    }
}
