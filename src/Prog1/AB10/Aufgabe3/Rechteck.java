package Prog1.AB10.Aufgabe3;

import Prog1.AB7.Aufgabe2.Punkt;
import Prog1.AB9.Aufgabe1.GeoFigur;

public class Rechteck extends GeoFigur {
    private Punkt eckeLinksUnten;
    private double laenge;
    private double breite;

    public Rechteck(Punkt eckeLinksUnten, double laenge, double breite,String farbe) throws NichtPositivException {
        super(farbe);
        if(breite <= 0 || laenge <= 0) {
            throw new NichtPositivException("Länge oder breite müssen positiv sein!");
        }
        this.breite = breite;
        this.laenge = laenge;
        this.eckeLinksUnten = eckeLinksUnten;
    }

    @Override
    public double berechneUmfang() {
        return 2 * laenge + 2 * breite;
    }

    @Override
    public double fInhalt() {
        return laenge * breite;
    }
}
