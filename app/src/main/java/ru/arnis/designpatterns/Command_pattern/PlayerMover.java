package ru.arnis.designpatterns.Command_pattern;

/**
 * Created by arnis on 28/08/16.
 */
public class PlayerMover {

    public static void move(Direction direction){
        direction.execute();
    }

    public static void undoMove(Direction direction){
        direction.undo();
    }
}
