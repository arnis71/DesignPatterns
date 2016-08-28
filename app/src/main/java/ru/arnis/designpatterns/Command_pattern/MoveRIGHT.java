package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class MoveRIGHT implements Direction {
    Player player;

    public MoveRIGHT(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveRIGHT();
    }

    @Override
    public void undo() {
        player.moveLEFT();
    }
}
