package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class MoveUP implements Direction {

    Player player;

    public MoveUP(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveUP();
    }

    @Override
    public void undo() {
        player.moveDOWN();
    }
}
