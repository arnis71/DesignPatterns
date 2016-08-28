package ru.arnis.designpatterns.Bridge_pattern;

import java.util.ArrayList;

/**
 * Created by arnis on 28/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Walker1 walker1 = new Walker1();
        Walker2 walker2 = new Walker2();

        SideWalker sideWalker = new SideWalker(walker1);
        SideWalker sideWalker1 = new SideWalker(walker2);

        sideWalker.walk();
        sideWalker.changeDir();

        sideWalker1.walk();
        sideWalker1.changeDir();
    }
}
