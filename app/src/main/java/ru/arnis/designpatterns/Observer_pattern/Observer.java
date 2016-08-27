package ru.arnis.designpatterns.Observer_pattern;

import java.util.ArrayList;

/**
 * Created by arnis on 26/08/16.
 */
public interface Observer {
    void update(ArrayList<Client> db);
}
