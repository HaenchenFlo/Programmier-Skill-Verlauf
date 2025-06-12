package ProgWiederholung.Prog1.AB9.Aufgabe1;

import Prog1.AB7.Aufgabe2.Punkt;

public class Viereck {
    private Punkt a,b,c,d;

    public Viereck(Punkt a, Punkt b, Punkt c, Punkt d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Punkt[] ecken() {
        return new Punkt[]{this.a,this.b,this.c,this.d};
    }

    public double umfang() {
        double ab = Math.sqrt(Math.pow(b.x - a.x,2) + Math.pow(b.y - a.y,2));
        double bc = Math.sqrt(Math.pow(c.x - b.x,2) + Math.pow(c.y - b.y,2));
        double cd = Math.sqrt(Math.pow(d.x - c.x,2) + Math.pow(d.y - c.y,2));
        double da = Math.sqrt(Math.pow(a.x - d.x,2) + Math.pow(a.y - d.y,2));

        return ab + bc + cd + da;
    }

    public String toString() {
        return "a: " + a + ",b: " + b + ",c: " + c + ",d: " + d;
    }
}
