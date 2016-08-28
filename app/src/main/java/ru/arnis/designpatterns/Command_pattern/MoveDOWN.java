package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class MoveDOWN implements Direction {

    Player player;

    public MoveDOWN(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveDOWN();
    }

    @Override
    public void undo() {
        player.moveUP();
    }
}
