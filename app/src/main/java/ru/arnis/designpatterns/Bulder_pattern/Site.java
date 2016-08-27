package ru.arnis.designpatterns.Bulder_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class Site {
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    String HTML = "";
    String CSS= "";
    String JS= "";
    String MySQL= "";
    String PHP= "";

    public Site(String url) {
        this.url = url;
    }

    public Site() {
    }

    public void getInfo(){
        System.out.println("Site with "+HTML+ " "+CSS+ " "+JS+ " "+MySQL+ " "+PHP);
    }

    public String getHTML() {
        return HTML;
    }

    public void setHTML(String HTML) {
        this.HTML = HTML;
    }

    public String getCSS() {
        return CSS;
    }

    public void setCSS(String CSS) {
        this.CSS = CSS;
    }

    public String getJS() {
        return JS;
    }

    public void setJS(String JS) {
        this.JS = JS;
    }

    public String getMySQL() {
        return MySQL;
    }

    public void setMySQL(String mySQL) {
        MySQL = mySQL;
    }

    public String getPHP() {
        return PHP;
    }

    public void setPHP(String PHP) {
        this.PHP = PHP;
    }
}
