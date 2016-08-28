package ru.arnis.designpatterns.Adapter_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class DataHandlerAdapter implements HandleData {
    DataHandlerV2 dataHandler;

    public void setAdapter(DataHandlerV2 dataHandler){
        this.dataHandler=dataHandler;
    }

    @Override
    public void signIN() {
        dataHandler.signIN();
    }

    @Override
    public void getData() {
        System.out.println("step depricated use loaddata");
    }

    @Override
    public void loadData() {
        dataHandler.getAndLoadData();
    }
}
