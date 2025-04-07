package Prog2.AB1.Aufgabe1;

public class Fussballer extends Sportler {
    private String verein;
    private boolean linksfuss;

    public Fussballer(String name, int gebJahr, int groesse, double gewicht, String verein, boolean linksfuss) {
        super(name, gebJahr, groesse, gewicht);
        this.verein = verein;
        this.linksfuss = linksfuss;
    }

    public String getVerein() {
        return this.verein;
    }

    public boolean getLinksfuss() {
        return this.linksfuss;
    }

    public String info() {
        return "Fußballverein: " + this.verein;
    }
}
