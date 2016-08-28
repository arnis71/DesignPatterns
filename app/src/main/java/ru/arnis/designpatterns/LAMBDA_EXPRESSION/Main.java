package ru.arnis.designpatterns.LAMBDA_EXPRESSION;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        ItemAdd itemAdd = new ItemAdd();
        itemAdd.addItem((str)->arrayList.add(str),"hello");
        AddListener addListener = (str -> arrayList.add(str));
        itemAdd.addItem(addListener,"heey");
    }
}

interface AddListener {
    void add(String str);
}

class ItemAdd {
    public void addItem(AddListener listener,String value){
        System.out.println("adding item");
        listener.add(value);
    }
}