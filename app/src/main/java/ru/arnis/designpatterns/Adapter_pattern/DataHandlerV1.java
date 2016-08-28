package ru.arnis.designpatterns.Adapter_pattern;

import android.os.Handler;

/**
 * Created by arnis on 28/08/16.
 */
public class DataHandlerV1 implements HandleData {
    @Override
    public void signIN() {
        System.out.println("signed in");
    }

    @Override
    public void getData() {
        System.out.println("data retreived");
    }

    @Override
    public void loadData() {
        System.out.println("data loaded");
    }
}
