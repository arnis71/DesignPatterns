package ru.arnis.designpatterns.Bulder_pattern;

/**
 * Created by arnis on 27/08/16.
 */
public class SiteBuilder implements Builder{

    Site site;

    public SiteBuilder() {
        this.site = new Site();
    }

    public void newSite(){
        this.site = new Site();
    }

    @Override
    public Site build(String type) {
        switch (type){
            case "front-end": site.setHTML("HTML");site.setCSS("CSS");site.setJS("JS");break;
            case "back-end": site.setMySQL("MySQL");site.setPHP("PHP");break;
            case "all": site.setHTML("HTML");site.setCSS("CSS");site.setJS("JS");
                site.setMySQL("MySQL");site.setPHP("PHP");break;
        }
        return site;
    }

    @Override
    public Builder addHTML(String type) {
        site.setHTML(type);
        return this;
    }

    @Override
    public Builder addCSS(String type) {
        site.setCSS(type);
        return this;
    }

    @Override
    public Builder addJS(String type) {
        site.setJS(type);
        return this;
    }

    @Override
    public Builder addPHP(String type) {
        site.setPHP(type);
        return this;
    }

    @Override
    public Builder addMySQL(String type) {
        site.setMySQL(type);
        return this;
    }

    @Override
    public Site getSite() {
        return site;
    }
}
