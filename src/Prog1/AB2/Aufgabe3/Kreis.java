package Prog1.AB2.Aufgabe3;

import Prog1.AB2.Aufgabe2.Punkt2D;

public class Kreis {
    Punkt2D mittelpunkt;
    double radius;

    public Kreis(Punkt2D p, double radius) {
        this.mittelpunkt = new Punkt2D(p); // Kopie des Punktes
        this.radius = radius;
    }

    public Kreis() {
        this.mittelpunkt = new Punkt2D(); // Ursprung
        this.radius = 1.0;
    }

    public void verschiebeUm(double dx, double dy) {
        this.mittelpunkt.verschiebeUm(dx, dy);
    }

    public void skalierung(double radiusSkalier) {
        this.radius *= radiusSkalier;
    }

    public double fInhalt() {
        return Math.PI * radius * radius;
    }

    public double umfang() {
        return 2 * Math.PI * radius;
    }

    public boolean imKreis(Punkt2D p) {
        return p.distanceTo(mittelpunkt) <= radius;
    }

    public String toString() {
        return "Mittelpunkt: " + mittelpunkt.toString() + ", Radius: " + radius;
    }
}
