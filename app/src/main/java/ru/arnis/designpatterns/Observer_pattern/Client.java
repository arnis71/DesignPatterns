package ru.arnis.designpatterns.Observer_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class Client {

    private int ID;
    private int balance;
    private boolean accountActive;

    private static int clientCounter = 0;

    public Client(int balance) {
        if (balance>0) {
            this.ID = clientCounter++;
            this.balance = balance;
            accountActive=true;
        }
        else System.out.println("balance shoulb be >0, try again");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }
}
