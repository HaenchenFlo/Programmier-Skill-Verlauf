package ProgWiederholung.Prog1.AB9.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class Quadrat extends Rechteck {
    private double kantenlaenge;

    public Quadrat(Punkt linksUnten, double kantenlaenge) {
        super(linksUnten, kantenlaenge, kantenlaenge);
        this.kantenlaenge = kantenlaenge;
    }

    public double kantenLaenge() {
        return kantenlaenge;
    }
}


