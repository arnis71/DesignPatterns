package ru.arnis.designpatterns.Decorator_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Main {

    public static void main(String[] args) {
        Order order1 = new BaseOrder();
        System.out.println(order1.getTotalPrice());
        order1 = new SaladsEntry(order1);
        System.out.println(order1.getTotalPrice());
        Order order2 = new EntreEntry(new SaladsEntry(new BaseOrder()));
        order2.addEntry("new ");
        System.out.println(order2.getTotalPrice());
    }
}
