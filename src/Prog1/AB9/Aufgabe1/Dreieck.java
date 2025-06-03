package Prog1.AB9.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class Dreieck extends GeoFigur{

    private Punkt a;
    private Punkt b;
    private Punkt c;

    public Dreieck(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Punkt[] ecken() {
        return new Punkt[] {a,b,c};
    }



    @Override
    public double berechneUmfang() {

        double ab = Math.sqrt(Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2));

        double ac = Math.sqrt(Math.pow((a.x - c.x),2) + Math.pow((a.y - c.y),2));

        double bc = Math.sqrt(Math.pow((b.x - c.x),2) + Math.pow((b.y - c.y),2));

        return ab + ac + bc;
    }

    @Override
    public double fInhalt() {
        return 0;
    }
}
