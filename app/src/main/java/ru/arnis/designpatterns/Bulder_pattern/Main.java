package ru.arnis.designpatterns.Bulder_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new SiteBuilder();
        Site site1 = builder.build("front-end");
        site1.getInfo();
        builder.newSite();
        Site site2 = builder.addPHP("php").addMySQL("mysql").getSite();
        site2.getInfo();
    }
}
