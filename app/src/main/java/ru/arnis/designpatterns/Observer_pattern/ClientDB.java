package ru.arnis.designpatterns.Observer_pattern;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by arnis on 26/08/16.
 */
public class ClientDB implements Subject {
    ArrayList<Observer> watchers;
    ArrayList<Client> db;

    public ClientDB(Client... clients) {
        watchers = new ArrayList<>();
        db = new ArrayList<>();
        Collections.addAll(db, clients);

    }

    public void withdraw(int ID,int amount){
        Client client = db.get(ID);
        if (client.isAccountActive()) {
            client.setBalance(client.getBalance()-amount);
            if (client.getBalance() <= 0) {
                client.setAccountActive(false);
                System.out.println("Client's account with "+ ID +" is disabled");
            }
        }
        notifyall();
    }


    @Override
    public void register(Observer observer) {
        watchers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        watchers.remove(observer);
    }

    @Override
    public void notifyall() {
        for (Observer watcher: watchers)
            watcher.update(db);
    }
}
