package ProgWiederholung.Prog1.AB9.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class Rechteck extends Viereck {

    private double hoehe,breite;
    private Punkt linksUnten;

    public Rechteck(Punkt linksUnten, double breite, double hoehe) {
        super(linksUnten,
                new Punkt(linksUnten.x + breite, linksUnten.y),
                new Punkt(linksUnten.x + breite, linksUnten.y + hoehe),
                new Punkt(linksUnten.x, linksUnten.y + hoehe));
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double hoehe() {
        return hoehe;
    }

    public double breite() {
        return breite;
    }

    public double fInhalt() {
        return hoehe * breite;
    }

    public double umfang() {
        return 2 * (hoehe + breite);
    }
}
