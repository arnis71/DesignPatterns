package ru.arnis.designpatterns.Bulder_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public interface Builder {

    Site build(String type);
    Builder addHTML(String type);
    Builder addCSS(String type);
    Builder addJS(String type);
    Builder addPHP(String type);
    Builder addMySQL(String type);
    void newSite();
    Site getSite();
}
