package htw.berlin.webtech.Projekt.web.api;

import java.io.File;

public class Test {

    private long id;
    private String name;
    private int zubereitungsdauer;
    private boolean vegan;
    private String tageszeit;

    public Test(long id, String name, int zubereitungsdauer, boolean vegan, String tageszeit) {
        this.id = id;
        this.name = name;
        this.zubereitungsdauer = zubereitungsdauer;
        this.vegan = vegan;
        this.tageszeit = tageszeit;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getZubereitungsdauer() { return zubereitungsdauer; }

    public void setZubereitungsdauer(int zubereitungsdauer) { this.zubereitungsdauer = zubereitungsdauer; }

    public boolean isVegan() { return vegan; }

    public void setVegan(boolean vegan) { this.vegan = vegan; }

    public String getTageszeit() { return tageszeit; }

    public void setTageszeit(String tageszeit) { this.tageszeit = tageszeit; }
}