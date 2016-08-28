package ru.arnis.designpatterns.Adapter_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Main {
    public static void main(String[] args) {
        HandleData datahandler1 = new DataHandlerV1();
        DataHandlerV2 dataHandler2 = new DataHandlerV2();
        DataHandlerAdapter adapter = new DataHandlerAdapter();
        adapter.setAdapter(dataHandler2);
        
        datahandler1.signIN();
        datahandler1.getData();
        datahandler1.loadData();

        adapter.signIN();
        adapter.getData();
        adapter.loadData();

    }
}
