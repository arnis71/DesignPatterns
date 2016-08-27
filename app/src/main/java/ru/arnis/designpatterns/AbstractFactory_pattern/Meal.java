package ru.arnis.designpatterns.AbstractFactory_pattern;

/**
 * Created by arnis on 26/08/16.
 */
public class Meal {

    private Starter starter;
    private Entre entre;
    private Desert desert;

    public Meal(Types types) {
        starter = types.addStarter();
        entre = types.addEntre();
        desert = types.addDesert();
    }

    public void eat(){
        if (starter!=null)
            System.out.println("Starter eaten");
        else System.out.println("No starter");
        if (entre!=null)
            System.out.println("Entre eaten");
        else System.out.println("No entre");
        if (desert!=null)
            System.out.println("Desert eaten");
        else System.out.println("No desert");
    }
}
