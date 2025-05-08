package Prog1.AB6.Aufgabe4;

import Prog1.AB5.Aufgabe4.Wuerfel;

public class Spieler {
    private static Wuerfel wuerfel = new Wuerfel();
    private String name;
    private int punktzahl;

    public Spieler(String name) {
        this.name = name;
        this.punktzahl = 0;
    }

    public String getName() {
        return this.name;
    }

    public int punkte() {
        return this.punktzahl;
    }

    public void punktPlus() {
        this.punktzahl++;
    }

    public void punktPlus(int n) {
        this.punktzahl += n;
    }

    public void reset() {
        this.punktzahl = 0;
    }

    public String toString() {
        return "Name: " + this.name + ", Punkte: " + punktzahl;
    }

    public int wuerfeln() {
        return wuerfel.wuerfeln();
    }
}
