package ru.arnis.designpatterns.Observer_pattern;

import java.util.ArrayList;

/**
 * Created by arnis on 26/08/16.
 */
public class Watchers implements Observer {
    public ArrayList<Client> myDB;
    private String position;

    public Watchers(String position) {
        this.position = position;
        this.myDB = new ArrayList<>();
    }

    @Override
    public void update(ArrayList<Client> db) {
        myDB=db;
        printClientsInfo();
    }

    private void printClientsInfo() {
        for (Client client:myDB){
            System.out.println("Watcher " + position + " is watching client with ID "+ client.getID() + " account is "+ client.isAccountActive() + " with balance: "+ client.getBalance());
        }
    }
}
