package ru.arnis.designpatterns.Decorator_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public abstract class OrderDecorator implements Order {

    Order order;

    public OrderDecorator(Order order) {
        this.order=order;
    }

    @Override
    public void addEntry(String entry) {
        order.addEntry(entry);
    }

    @Override
    public int getTotalPrice() {
        return order.getTotalPrice();
    }
}
