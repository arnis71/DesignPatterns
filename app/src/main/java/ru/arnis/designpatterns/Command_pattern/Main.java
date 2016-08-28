package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(0,0);
        player1.getCurrentXY();
        Direction direction = new MoveDOWN(player1);
        PlayerMover.move(direction);
        player1.getCurrentXY();
        PlayerMover.move(new MoveRIGHT(player1));
        player1.getCurrentXY();
        PlayerMover.undoMove(new MoveRIGHT(player1));
        player1.getCurrentXY();
    }
}
