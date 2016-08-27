package ru.arnis.designpatterns.Observer_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(100);
        Client client2 = new Client(50);
        Client client3 = new Client(10);

        Watchers manager = new Watchers("manager");
        Watchers director = new Watchers("director");
        ClientDB db = new ClientDB(client1,client2,client3);
        db.register(manager);
        db.register(director);

        db.withdraw(0,12);
        db.unregister(manager);
        db.withdraw(2,20);
    }
}
