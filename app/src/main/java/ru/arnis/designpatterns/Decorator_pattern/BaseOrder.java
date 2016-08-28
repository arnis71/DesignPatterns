package ru.arnis.designpatterns.Decorator_pattern;

import java.util.ArrayList;

/**
 * Created by arnis on 28/08/16.
 */
public class BaseOrder implements Order {
    public BaseOrder() {
        entries = new ArrayList<>();
    }

    public ArrayList<String> entries;

    @Override
    public void addEntry(String entry) {
        entries.add(entry);
        System.out.println(entry+" added");
    }

    @Override
    public int getTotalPrice() {
        return 0;
    }
}
