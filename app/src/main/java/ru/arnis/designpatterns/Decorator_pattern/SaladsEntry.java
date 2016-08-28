package ru.arnis.designpatterns.Decorator_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class SaladsEntry extends OrderDecorator {

    public SaladsEntry(Order order) {
        super(order);
    }

    @Override
    public void addEntry(String entry) {
        super.addEntry("salads");
        System.out.println("salad added");
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+5;
    }
}
