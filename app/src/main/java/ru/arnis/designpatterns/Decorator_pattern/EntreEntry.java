package ru.arnis.designpatterns.Decorator_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class EntreEntry extends OrderDecorator {
    public EntreEntry(Order order) {
        super(order);
    }

    @Override
    public void addEntry(String entry) {
        super.addEntry("meat");
        System.out.println("meat added");
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+10;
    }
}
