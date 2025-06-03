package Prog1.AB9.Aufgabe3;

public abstract class Mitarbeiter {
    public String name;
    public int gebJahr;
    public int persNr;
    public static int naechsteNr = 1;

    public Mitarbeiter(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
        this.persNr = naechsteNr++;
    }

    public int getPersNr() {
        return persNr;
    }

    public String toString() {
        return name + ": " + persNr;
    }

    public abstract double getGehalt();
}
