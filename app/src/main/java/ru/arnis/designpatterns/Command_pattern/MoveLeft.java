package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class MoveLEFT implements Direction {
    Player player;

    public MoveLEFT(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveLEFT();
    }

    @Override
    public void undo() {
        player.moveRIGHT();
    }
}
