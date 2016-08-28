package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Player implements PlayerControls {

    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void moveUP() {
        System.out.println("player moved up");
        y++;
    }

    @Override
    public void moveDOWN() {
        System.out.println("player moved down");
        y--;
    }

    @Override
    public void moveLEFT() {
        System.out.println("player moved left");
        x--;
    }

    @Override
    public void moveRIGHT() {
        System.out.println("player moved right");
        x++;
    }

    public void getCurrentXY(){
        System.out.println("player now at: "+x+":"+y);
    }
}
