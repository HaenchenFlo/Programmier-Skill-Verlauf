package Prog1.AB9.Aufgabe4;

import Prog1.AB11.Aufgabe3.Gegenstand;
import Prog1.AB11.Aufgabe3.Kaufbar;
import Prog1.AB11.Aufgabe3.Tragbar;

public abstract class Wesen {
    public String name;
    public int alter;
    public double geldbeutel;
    public Tragbar ding;

    public Wesen(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.geldbeutel = 0.0;
        this.ding = null;
    }

    public abstract boolean lebendig();

    public abstract String gruss();

    public abstract void nehmen(Tragbar d);

    public Tragbar tragen() {
        return ding;
    }

    public void kaufen(Kaufbar g) {
        double preis = g.preis();

        if (this.geldbeutel >= preis) {
            this.geldbeutel -= preis;

            if (g instanceof Tragbar) {
                this.nehmen((Tragbar) g);
            }
            if (g instanceof Gegenstand) {
                System.out.println(name + " hat " + ((Gegenstand) g).getBezeichnung() + " gekauft.");
            }
            if(g instanceof Wesen) {
                System.out.println(name + " hat " + ((Wesen) g).name + " gekauft.");
            }
        } else {
            System.out.println(name + " hat nicht genug Geld für den Kauf.");
        }
    }


    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }
}
